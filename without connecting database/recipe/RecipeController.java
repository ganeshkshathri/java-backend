/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.recipe.*;

@RestController
public class RecipeController{
    RecipeService recipeService = new RecipeService();
    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }
    
    @PostMapping("/recipes")
    public Recipe addNewRecipe(@RequestBody Recipe recipe){
        return recipeService.addNewRecipe(recipe);
    }
    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipe(@PathVariable("recipeId") int recipeId){
        return recipeService.getRecipe(recipeId);
    }
    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId,@RequestBody Recipe recipe){
        return recipeService.updateRecipe(recipeId,recipe);
    }
    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId){
        recipeService.deleteRecipe(recipeId);
    }
    
}

