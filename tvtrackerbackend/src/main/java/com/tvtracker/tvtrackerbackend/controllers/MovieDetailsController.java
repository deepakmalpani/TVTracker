package com.tvtracker.tvtrackerbackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import com.tvtracker.tvtrackerbackend.repositories.MovieRepository;
import com.tvtracker.tvtrackerbackend.models.MovieModel;

@RestController
@RequestMapping("/moviedetails")
public class MovieDetailsController{
    
    private MovieRepository movieRepository;

    public MovieDetailsController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public Iterable<MovieModel> findAllMovies(){

        return this.movieRepository.findAll();
    }

    @PostMapping("/")
    public MovieModel addOneMovie(@RequestBody MovieModel movie){
        System.out.println(movie);
        return this.movieRepository.save(movie);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<MovieModel> findByImdbId(@PathVariable String imdbId){
        Optional<MovieModel> movieOptional = Optional.ofNullable(this.movieRepository.findByImdbId(imdbId));
        if (movieOptional.isPresent()){
            return ResponseEntity.ok(movieOptional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
