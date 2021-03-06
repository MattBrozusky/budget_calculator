package com.matthewbudget.budget_calculator.services;

import com.matthewbudget.budget_calculator.models.Budget;
import com.matthewbudget.budget_calculator.models.User;
import com.matthewbudget.budget_calculator.repositories.BudgetRepository;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    private final BudgetRepository budgetDao;

    public BudgetService(BudgetRepository budgetDao) {
        this.budgetDao = budgetDao;
    }

    public Budget myBudget(User user) {
        return budgetDao.findBudgetByOwnerEquals(user);
    }

    public long save(Budget budget) {
        budgetDao.save(budget);
        return budget.getId();
    }

    public void edit(Budget budget){

    }

    public void delete(long id){
        budgetDao.delete(id);
    }


}
