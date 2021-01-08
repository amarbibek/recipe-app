package com.mycodestuffs.recipeapp.services;

import com.mycodestuffs.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
