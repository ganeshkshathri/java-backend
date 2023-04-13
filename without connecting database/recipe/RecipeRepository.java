// Write your code here
package com.example.recipe;

import java.util.*;
import com.example.recipe.Recipe;
public interface RecipeRepository{
    ArrayList<Recipe> getAllRecipes();
    Recipe addNewRecipe(Recipe recipe);
    Recipe getRecipe(int recipeId);
    Recipe updateRecipe(int recipeId,Recipe recipe);
    void deleteRecipe(int recipeId);
}