package com.matthewbudget.budget_calculator.repositories;

import com.matthewbudget.budget_calculator.models.Budget;
import com.matthewbudget.budget_calculator.models.User;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository<Budget, Long> {

    Budget findBudgetByOwnerEquals(User user);
}
