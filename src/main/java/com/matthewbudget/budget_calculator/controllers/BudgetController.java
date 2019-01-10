package com.matthewbudget.budget_calculator.controllers;

import com.matthewbudget.budget_calculator.models.Budget;
import com.matthewbudget.budget_calculator.services.BudgetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService){
        this.budgetService = budgetService;
    }

    @GetMapping("/budget/create")
    public String createBudget(Model model){
        model.addAttribute("budget", new Budget());
        return "budget/create-budget";
    }

    @PostMapping("/budget/create")
    public String submitBudget(){

        return "";
    }

    @GetMapping("/budget/view/{userId}")
    public String viewBudget(@PathVariable long userId, Model model){
        model.addAttribute("budget", budgetService.myBudget(userId));
        return "budget/view";
    }
}
