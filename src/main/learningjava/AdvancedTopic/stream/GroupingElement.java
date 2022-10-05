package main.learningjava.AdvancedTopic.stream;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingElement {
    public static void show() {
        var movies = List.of(
                new Movie("c", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.COMEDY),
                new Movie("a", 30, Genre.THRILLER),
                new Movie("a", 30, Genre.HORROR)
        );

       var result =  movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
        System.out.println("result " + result);

        var  result2 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getTitle, Collectors.mapping(Movie::getTitle, Collectors.joining())));

    }
}
