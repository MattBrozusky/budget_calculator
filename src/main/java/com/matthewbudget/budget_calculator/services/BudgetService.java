package com.matthewbudget.budget_calculator.services;

import com.matthewbudget.budget_calculator.models.Budget;
import com.matthewbudget.budget_calculator.repositories.BudgetRepository;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    private final BudgetRepository budgetDao;

    public BudgetService(BudgetRepository budgetDao) {
        this.budgetDao = budgetDao;
    }

    public Budget myBudget(long userId) {
        return budgetDao.findOne(userId);
    }

    public long save(Budget budget) {
        budgetDao.save(budget);
        return budget.getId();
    }

    public void delete(long id){
        budgetDao.delete(id);
    }


}
