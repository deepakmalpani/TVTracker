package com.tvtracker.tvtrackerbackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/{imdbId}")
    public ResponseEntity<MovieModel> findByimdbId(@PathVariable String imdbId){
        Optional<MovieModel> movieModelOptional = Optional.of(movieRepository.findByimdbId(imdbId));
        if (movieModelOptional.isPresent()){
            return ResponseEntity.ok(movieModelOptional.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
