package com.matthewbudget.budget_calculator.controllers;

import com.matthewbudget.budget_calculator.models.Budget;
import com.matthewbudget.budget_calculator.models.User;
import com.matthewbudget.budget_calculator.services.BudgetService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService){
        this.budgetService = budgetService;
    }

    //Create A Budget Form
    @GetMapping("/budget/create")
    public String createBudget(Model model){
        Budget userBudget = budgetService.myBudget((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        if (userBudget != null){
            return "redirect:/budget/view";
        }
        model.addAttribute("createOrEdit", "create");
        model.addAttribute("budget", new Budget());
        return "budget/create-edit-budget";
    }

    //Submit Your Budget
    @PostMapping("/budget/create")
    public String submitBudget(@ModelAttribute Budget budget){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        budget.setOwner(owner);
        budget.getMonthlyExpenses().setBudget(budget);
        budget.getMonthlyIncome().setBudget(budget);
        budget.getMonthlySavings().setBudget(budget);
        budgetService.save(budget);
        return "redirect:/budget/view";
    }

    //Edit Your Budget
    @GetMapping("/budget/edit")
    public String editBudget(Model model){
        Budget userBudget = budgetService.myBudget((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        if (userBudget == null){
            return "redirect:/budget/create";
        }
        model.addAttribute("createOrEdit", "edit");
        model.addAttribute("budget", userBudget);
        return "budget/create-edit-budget";
    }

    //Submit Budget Edit
    @PostMapping("/budget/edit")
    public String editBudgetSubmit(@ModelAttribute Budget userBudget){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Budget deleteBudget = budgetService.myBudget(owner);
        budgetService.delete(deleteBudget.getId());

        userBudget.setOwner(owner);
        userBudget.getMonthlyExpenses().setBudget(userBudget);
        userBudget.getMonthlyIncome().setBudget(userBudget);
        userBudget.getMonthlySavings().setBudget(userBudget);
        budgetService.save(userBudget);
        return "redirect:/budget/view";
    }

    //View Your Budget
    @GetMapping("/budget/view")
    public String viewBudget(Model model){
        User owner = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("budget", budgetService.myBudget(owner));
        return "budget/view";
    }

}
