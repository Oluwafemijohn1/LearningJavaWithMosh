package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class MappingElementWithStream {
    public static void show(){
        var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(System.out::println);

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(System.out::println);

        movies.stream()
                .map(Movie::getTitle)
                .forEach(System.out::println);

    }
}
