package com.matthewbudget.budget_calculator.repositories;

import com.matthewbudget.budget_calculator.models.Budget;
import org.springframework.data.repository.CrudRepository;

public interface BudgetRepository extends CrudRepository<Budget, Long> {
}
