package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class GettingUniqueElement {
    public static void show() {
        var movies = List.of(
                new Movie("c", 10),
                new Movie("b", 20),
                new Movie("a", 30),
                new Movie("a", 30)
        );

        movies.stream()
                .map(Movie::getTitle)
                .distinct()
                .forEach(System.out::println);


    }
}
