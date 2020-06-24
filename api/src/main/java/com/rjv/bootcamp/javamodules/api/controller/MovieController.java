package com.rjv.bootcamp.javamodules.api.controller;

import com.rjv.bootcamp.javamodules.domain.Movie;
import com.rjv.bootcamp.javamodules.service.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> all() {
        return movieService.allMovies();
    }

    @GetMapping("/{id}")
    public Movie byId(@PathVariable String id) {
        return movieService.movieById(id).orElse(new Movie("", "", ""));
    }
}
