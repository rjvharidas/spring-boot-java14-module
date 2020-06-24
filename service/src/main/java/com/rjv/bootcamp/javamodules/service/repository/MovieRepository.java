package com.rjv.bootcamp.javamodules.service.repository;

import com.rjv.bootcamp.javamodules.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
}

