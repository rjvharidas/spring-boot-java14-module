package com.rjv.bootcamp.javamodules.service.service;

import com.rjv.bootcamp.javamodules.domain.Movie;
import com.rjv.bootcamp.javamodules.service.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

   private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(String id) {
        return movieRepository.findById(id);
    }
}
