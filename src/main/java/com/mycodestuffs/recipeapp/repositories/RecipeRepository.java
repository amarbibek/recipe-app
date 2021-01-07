package com.mycodestuffs.recipeapp.repositories;

import com.mycodestuffs.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
