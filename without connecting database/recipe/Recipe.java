package com.example.recipe;
import java.util.*;
public class Recipe{
    
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public Recipe(int recipeId,String recipeName,String recipeType,List<String> ingredients){
        this.recipeId=recipeId;
        this.recipeName=recipeName;
        this.recipeType=recipeType;
        this.ingredients=ingredients;
    }

    //getters and setter for recipeId 
    public void setRecipeId(int recipeId){
        this.recipeId=recipeId;

    }
    public int getRecipeId(){
        return this.recipeId;
    }
    //getters and setter for recipeName 
    public void setRecipeName(String recipeName){
        this.recipeName=recipeName;
    }
    public String getRecipeName(){
        return this.recipeName;
    }
    //getter and setters for recipeType
    public void setRecipeType(String recipeType){
        this.recipeType=recipeType;
    }
    public String getRecipeType(){
        return this.recipeType;
    }
    //getter and setter for ingrediants
    public void setIngredients(List<String> ingredients){
        this.ingredients=ingredients;
    }
    public List<String> getIngredients(){
        return this.ingredients;
    }
}