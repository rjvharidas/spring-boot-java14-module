package com.rjv.bootcamp.javamodules.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String id;
    private String title;
    private String genre;
}
