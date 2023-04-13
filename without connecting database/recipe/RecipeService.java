package com.example.recipe;

import com.example.recipe.RecipeRepository;
import com.example.recipe.Recipe;

import java.util.*;
 import org.springframework.web.server.ResponseStatusException;

import ch.qos.logback.classic.joran.action.ReceiverAction;

import org.springframework.http.HttpStatus;

// Don't modify the below code

public class RecipeService implements RecipeRepository {

        private static HashMap<Integer, Recipe> recipeBook = new HashMap<>();
        int uniqueid=6;

        public RecipeService() {
                recipeBook.put(1,
                                new Recipe(1, "Pasta", "veg",
                                                Arrays.asList("pasta", "tomatoes", "olive oil", "garlic", "basil")));
                recipeBook.put(2, new Recipe(2, "Chicken Curry", "non-veg",
                                Arrays.asList("chicken", "onion", "tomato", "ginger", "garlic", "spices")));
                recipeBook.put(3, new Recipe(3, "Sushi", "non-veg",
                                Arrays.asList("sushi rice", "tuna fish", "seaweed", "wasabi", "ginger")));
                recipeBook.put(4, new Recipe(4, "Mushroom Risotto", "veg",
                                Arrays.asList("rice", "mushrooms", "onion", "garlic", "butter", "parmesan")));
                recipeBook.put(5, new Recipe(5, "Fish and Chips", "non-veg",
                                Arrays.asList("fish", "potatoes", "flour", "oil", "spices")));
        }

        // Don't modify the above code

        // Write your code here
        @Override 
        public ArrayList<Recipe> getAllRecipes(){
                Collection<Recipe> allRecipeCollection =recipeBook.values();
                ArrayList<Recipe> allRecipes = new ArrayList<>(allRecipeCollection);
                return allRecipes;
        }
        @Override
        public Recipe addNewRecipe(Recipe recipe){
                recipe.setRecipeId(uniqueid);
                recipeBook.put(uniqueid,recipe);
                uniqueid+=1;
                return recipe;

        }
        @Override 
        public Recipe getRecipe(int recipeId){
                if(recipeBook.get(recipeId) == null){
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

                }
               return recipeBook.get(recipeId);
        }
        @Override 
        public  Recipe updateRecipe(int recipeId,Recipe recipe){
                Recipe existingRecipe =recipeBook.get(recipeId);
                if(recipeBook.get(recipeId) == null){
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

                }
                else{
                        if(recipe.getRecipeName()!=null){
                                existingRecipe.setRecipeName(recipe.getRecipeName());
                        }
                        if(recipe.getIngredients()!=null){
                                existingRecipe.setIngredients(recipe.getIngredients());
                        }
                        if(recipe.getRecipeType()!=null){
                                existingRecipe.setRecipeType(recipe.getRecipeType());
                        }
                }
                return existingRecipe;
        }
        @Override
        public void deleteRecipe(int recipeId){
                if(recipeBook.get(recipeId)==null){
             throw new ResponseStatusException(HttpStatus.NOT_FOUND);

                }
                else{
                        recipeBook.remove(recipeId);
             throw new ResponseStatusException(HttpStatus.NO_CONTENT);

                }
        }
}