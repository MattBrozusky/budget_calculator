package com.matthewbudget.budget_calculator.services;

import com.matthewbudget.budget_calculator.models.Budget;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    private Budget budget;


    public BudgetService() {
        budget = new Budget();
        createBudget();
    }

    public Budget myBudget(long userId) {
        return budget;
    }

    public Budget create(Budget budget) {

        return budget;
    }

    public Budget edit(Budget budget){

        return budget;
    }

    private void createBudget() {

    }

}
