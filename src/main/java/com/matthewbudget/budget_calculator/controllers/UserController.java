package com.matthewbudget.budget_calculator.controllers;

import com.matthewbudget.budget_calculator.models.User;
import com.matthewbudget.budget_calculator.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    private UsersRepository users;
    private PasswordEncoder passwordEncoder;

    public UserController(UsersRepository users, PasswordEncoder passwordEncoder){
        this.users = users;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "authentication/register";
    }

    @PostMapping("/sign-up")
    public String saveUser(@Valid User user, Errors validation, Model model){
        if (validation.hasErrors() || users.findByUsername(user.getUsername()) != null || users.findByEmail(user.getEmail()) != null) {
            if (users.findByUsername(user.getUsername()) != null ){
                model.addAttribute("usernameTaken", true);
            }
            if (users.findByEmail(user.getEmail()) != null){
                model.addAttribute("emailTaken", true);
            }
            model.addAttribute("errors", validation);
            model.addAttribute("user", user);
            return "authentication/register";
        }

        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        users.save(user);
        return "redirect:/login";
    }
}
