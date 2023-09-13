package com.tvtracker.tvtrackerbackend.repositories;

import com.tvtracker.tvtrackerbackend.models.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieModel, Long>{

    // MovieModel findByimdbId(String imdbId);
}