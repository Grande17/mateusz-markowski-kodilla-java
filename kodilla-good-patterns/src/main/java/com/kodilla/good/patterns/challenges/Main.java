package com.kodilla.good.patterns.challenges;



public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream()
                .flatMap(y -> y.stream())
                .map(x -> x+"!")
                .forEach(System.out::println);

    }
}
