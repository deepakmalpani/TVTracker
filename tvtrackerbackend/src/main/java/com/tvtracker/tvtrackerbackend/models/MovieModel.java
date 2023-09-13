package com.tvtracker.tvtrackerbackend.models;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonSetter("id")
    private Integer id;

    @JsonSetter("Title")
    private String Title;

    @JsonSetter("Year")
    private String Year;

    @JsonSetter("Rated")
    private String Rated;

    @JsonSetter("Genre")
    private String Genre;

    @JsonSetter("Director")
    private String Director;

    @JsonSetter("Actors")
    private String Actors;

    @JsonSetter("Plot")
    private String Plot;

    @JsonSetter("Type")
    private String Type;

    @JsonSetter("imdbID")
    private String imdbId;

    MovieModel(){}

    public MovieModel( String Title, String Year, String Rated, String Genre, String Director, String Actors, String Plot, String Type, String imdbId){
        
        this.Title = Title;
        this.Year = Year;
        this.Rated = Rated;
        this.Genre = Genre;
        this.Director = Director;
        this.Actors = Actors;
        this.Plot = Plot;
        this.Type = Type;
        this.imdbId = imdbId;
    }

    @Override
    public String toString() {
        return "MyClass{" +
               "id=" + id +
               ", imdbId='" + this.imdbId + '\'' +
               ", imdbId='" + this.Title + '\'' +
               ", imdbId='" + this.Year + '\'' +
               ", imdbId='" + this.Rated + '\'' +
               ", imdbId='" + this.Genre + '\'' +
               ", imdbId='" + this.Director + '\'' +
               '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String rated) {
        Rated = rated;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
