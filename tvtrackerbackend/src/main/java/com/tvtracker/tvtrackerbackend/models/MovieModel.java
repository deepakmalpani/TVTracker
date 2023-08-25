package com.tvtracker.tvtrackerbackend.models;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieModel {
    
    private @Id @GeneratedValue Long id;
    private String imdbId;
    private String title;
    private String year;
    private String rated;
    private String genre;
    private String director;
    private String actors;
    private String plot;
    private String type;

    MovieModel(){}

    MovieModel(String imdbId, String title, String year, String rated, String genre, String director, String actors, String plot, String type){
        this.imdbId = imdbId;
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        this.type = type;
    }

}
