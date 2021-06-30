package com.cmassystems.spring5recipeapp.services;

import com.cmassystems.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
