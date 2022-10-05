package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class PeekStream {
    public static void show() {
        var movies = List.of(
                new Movie("c", 10, Genre.COMEDY),
                new Movie("b", 20, Genre.HORROR),
                new Movie("a", 30, Genre.THRILLER),
                new Movie("a", 30, Genre.ACTION)
        );

        movies.stream()
                .filter(f -> f.getLikes() > 10)
                .peek(m -> System.out.println("Filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(m -> System.out.println("Mapped: " + m))
                .distinct()
                .peek(d -> System.out.println("Distinct: " + d))
                .forEach(System.out::println);

    }
}
