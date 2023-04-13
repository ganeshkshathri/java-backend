// Write your code here
package com.example.movie.repository;

import java.util.ArrayList;
import com.example.movie.model.Movie;

public interface MovieRepository{
    ArrayList<Movie> getmovielist();
    Movie addmovie(Movie movie);
    Movie getMovieById(int movieId);
    Movie updateMovieById(int movieId,Movie movie);
    void deleteMoviebyId(int movieId);
}