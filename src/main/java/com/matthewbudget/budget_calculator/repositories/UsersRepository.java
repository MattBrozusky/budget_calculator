package com.matthewbudget.budget_calculator.repositories;

import com.matthewbudget.budget_calculator.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
