package com.rjv.bootcamp.javamodules.service.repository;

import com.rjv.bootcamp.javamodules.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
}

