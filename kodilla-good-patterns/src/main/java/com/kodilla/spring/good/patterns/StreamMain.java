package com.kodilla.spring.good.patterns;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(e -> e.stream())
                .collect(Collectors.joining("!"));
        System.out.println(movies);
    }
}
