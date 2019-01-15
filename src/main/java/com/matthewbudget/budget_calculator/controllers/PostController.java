package com.matthewbudget.budget_calculator.controllers;


import com.matthewbudget.budget_calculator.models.Post;
import com.matthewbudget.budget_calculator.models.User;
import com.matthewbudget.budget_calculator.services.PostService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //See All Posts
    @GetMapping("/posts")
    public String index(Model model){
        model.addAttribute("posts", postService.all());
        return "posts/index";
    }

    //See One Post
    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        model.addAttribute("post", postService.one(id));

        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (postService.one(id).getOwner().getId() == owner.getId()){
            model.addAttribute("owner", true);
        }
        return "posts/show";
    }

    //Delete Post
    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable long id){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (postService.one(id).getOwner().getId() != owner.getId()){
            return "redirect:/posts/" + String.valueOf(id);
        }
        postService.delete(id);
        return "redirect:/posts";
    }

    //Edit Post Form
    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (postService.one(id).getOwner().getId() != owner.getId()){
            return "redirect:/posts/" + String.valueOf(id);
        }
        model.addAttribute("edit", true);
        model.addAttribute("post", postService.one(id));
        return "posts/create-edit";
    }

    //Submit Form Edit
    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post){
        String idString = String.valueOf(postService.save(post));
        return "redirect:/posts/" + idString;
    }

    //Create Post Page
    @GetMapping("/posts/create")
    public String createForm(Model model){
        model.addAttribute("create", true);
        model.addAttribute("post", new Post());
        return "posts/create-edit";
    }

    //Submit Post Creation
    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setOwner(owner);
        String idString = String.valueOf(postService.save(post));
        return "redirect:/posts/" + idString;
    }

}
