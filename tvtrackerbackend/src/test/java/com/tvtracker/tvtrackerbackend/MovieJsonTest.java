package com.tvtracker.tvtrackerbackend;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.beans.Transient;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

import com.tvtracker.tvtrackerbackend.models.MovieModel;

@JsonTest
public class MovieJsonTest {
    
    @Autowired
    private JacksonTester<MovieModel> json;

    @Autowired
    private JacksonTester<MovieModel[]> jsonList;

    private MovieModel[] movies;

    @BeforeEach
    void setUp(){
        movies = Arrays.array(
            new MovieModel("xyz","title1","2000","rated1","genre1","director1","actor1","plot1","type1" )
        );
    }

    @Test
    public void MovieSerializationTest() throws IOException{
        MovieModel movie = movies[0];
        System.out.println(movie);
        System.out.println(json.write(movie));
        System.out.println(movie.getImdbId());
        assertThat(json.write(movie)).isStrictlyEqualToJson("single.json");
    }
}
