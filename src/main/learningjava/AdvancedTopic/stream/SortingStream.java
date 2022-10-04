package main.learningjava.AdvancedTopic.stream;

import java.util.Comparator;
import java.util.List;

public class SortingStream {
    public static void show(){
        var movies = List.of(new Movie("c", 10), new Movie("b", 20), new Movie("a", 30));
        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle))
                .forEach(System.out::println);

        movies.stream()
                .sorted(Comparator.comparing(Movie::getLikes).reversed())
                .forEach(System.out::println);
    }
}
