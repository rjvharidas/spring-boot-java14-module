package com.rjv.bootcamp.javamodules.service.configuration;

import com.rjv.bootcamp.javamodules.domain.Movie;
import com.rjv.bootcamp.javamodules.service.repository.MovieRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
@ComponentScan("com.rjv.bootcamp.javamodules.service.*")
@EnableJpaRepositories("com.rjv.bootcamp.javamodules.service.repository")
public class ServiceConfiguration {

    @Bean
    public List<Movie> addMovies(MovieRepository repository){
        return repository.saveAll(getMovies());
    }

    public List<Movie> getMovies() {
        return List.of(apply("1", "Terminator", "Action"),
                apply("2", "Matrix", "Action"),
                apply("3", "Spiderman", "Family"),
                apply("4", "Twilight", "Horror"),
                apply("5", "Sachin", "Documentary"),
                apply("6", "Avathar", "Drama"),
                apply("7", "Hangout", "Comedy"));
    }

    private Movie apply(String id, String title, String genre){
        return new Movie(id, title, genre);
    }
}
