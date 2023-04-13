
package com.example.movie.service;

import com.example.movie.repository.MovieRepository;
import com.example.movie.model.Movie;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.movie.model.MovieRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
 
 
 // Don't modify the below code
 
@Service
public class MovieH2Service implements MovieRepository{
    @Autowired
    private JdbcTemplate db;
    @Override 
    public ArrayList<Movie> getmovielist(){
        List<Movie> movieList = db.query("SELECT * FROM MOVIELIST",new MovieRowMapper());
        ArrayList<Movie> movieLists = new ArrayList<>(movieList);
        return movieLists;

    }
    @Override
    public Movie getMovieById(int movieId){
        try{
    Movie movie = db.queryForObject("Select * from MOVIELIST where movieId = ?",new MovieRowMapper(),movieId);
    return movie;
    }catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    
    }
    @Override
    public Movie addmovie(Movie movie){
        db.update("insert into MOVIELIST (movieName, leadActor) values (?,?)",movie.getMovieName(),movie.getLeadActor());
        Movie savedMovie= db.queryForObject("select * from MOVIELIST where movieName = ? and leadActor = ?", new MovieRowMapper(),movie.getMovieName(),movie.getLeadActor());
        return savedMovie;
    }
    @Override
    public Movie updateMovieById(int movieId,Movie movie){
        if(movie.getMovieName()!=null){
        db.update("update MOVIELIST set movieName = ? where movieId =?", movie.getMovieName(),movieId);
        }
        if(movie.getLeadActor()!=null){
        db.update("update MOVIELIST set leadActor = ? where movieId =?", movie.getLeadActor(),movieId);
        }
        
        
        return getMovieById(movieId);
    }
    @Override
    public void deleteMoviebyId(int movieId){
        db.update("delete from MOVIELIST where movieId = ?", movieId);
    }
     

}