package com.tvtracker.tvtrackerbackend.models;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter 
    private Integer id;

    // @Column(name = "imdb_id")
    @Getter @Setter
    private String imdbId;

    @Getter @Setter
    private String Title;

    @Getter @Setter
    private String Year;

    @Getter @Setter
    private String Rated;

    @Getter @Setter
    private String Genre;

    @Getter @Setter
    private String Director;

    @Getter @Setter
    private String Actors;

    @Getter @Setter
    private String Plot;

    @Getter @Setter
    private String Type;

    MovieModel(){}

    public MovieModel(String imdbId, String Title, String Year, String Rated, String Genre, String Director, String Actors, String Plot, String Type){
        this.imdbId = imdbId;
        this.Title = Title;
        this.Year = Year;
        this.Rated = Rated;
        this.Genre = Genre;
        this.Director = Director;
        this.Actors = Actors;
        this.Plot = Plot;
        this.Type = Type;
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

}
