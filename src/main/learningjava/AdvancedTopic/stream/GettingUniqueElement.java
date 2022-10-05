package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class GettingUniqueElement {
    public static void show() {
        var movies = List.of(
                new Movie("c", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.COMEDY),
                new Movie("a", 30, Genre.THRILLER),
                new Movie("a", 30, Genre.HORROR)
        );

        movies.stream()
                .map(Movie::getTitle)
                .distinct()
                .forEach(System.out::println);


    }
}
