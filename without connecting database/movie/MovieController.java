
package com.example.movie;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.movie.MovieService;
import com.example.movie.Movie;

@RestController
public class MovieController{
    MovieService movieService=new MovieService();
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