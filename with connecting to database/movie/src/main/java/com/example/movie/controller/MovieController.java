
package com.example.movie.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.movie.model.Movie;
import com.example.movie.service.MovieH2Service;

import java.util.*;

@RestController
public class MovieController{
    @Autowired
    MovieH2Service movieService;
    @GetMapping("/movies")
    public ArrayList<Movie> getMovielist(){
        return movieService.getmovielist();
    }
    @PostMapping("/movies")
    public Movie addmovie(@RequestBody Movie movie){
        return movieService.addmovie(movie);
    }
    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId){
        return movieService.getMovieById(movieId);
    }
    @PutMapping("movies/{movieId}")
    public Movie updateMovieById(@PathVariable("movieId") int movieId,@RequestBody Movie movie){
        return movieService.updateMovieById(movieId,movie);
        
    }
    @DeleteMapping("/movies/{movieId}")
    public void deleteMoviebyId(@PathVariable("movieId") int movieId){
        movieService.deleteMoviebyId(movieId);
        
    }
}