package com.matthewbudget.budget_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BudgetController {

    @GetMapping("/create-budget")
    public String createBudget(){
        return "budget/create-budget";
    }
}
