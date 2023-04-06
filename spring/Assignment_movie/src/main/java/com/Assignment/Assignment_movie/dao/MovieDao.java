package com.Assignment.Assignment_movie.dao;

import org.springframework.data.repository.CrudRepository;
import com.Assignment.Assignment_movie.movie.Movie;

public interface MovieDao extends CrudRepository<Movie, Integer> {

}
