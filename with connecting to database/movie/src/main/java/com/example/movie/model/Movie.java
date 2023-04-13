package com.example.movie.model;

public class Movie{
    private int movieId ;
    private String movieName;
    private String leadActor;

    public Movie(int movieId,String movieName,String leadActor){
        this.movieId=movieId;
        this.movieName=movieName;
        this.leadActor=leadActor;

    }
    //setter and getter for movie id 
    public int getMovieId(){
        return this.movieId;
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    //getter and setter ffor movie name
    public String getMovieName(){
        return this.movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    //getter and setter for leadactor
    public void setLeadActor(String leadActor){
        this.leadActor=leadActor;
    }
    public String getLeadActor(){
        return this.leadActor;
    }
}