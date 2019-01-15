package com.matthewbudget.budget_calculator.repositories;


import com.matthewbudget.budget_calculator.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}