package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class SlicingStream {
    public static void show() {
        var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
        movies.stream()
                //Used for Pagination
                // 1000 movies in the database
                // 10 movies per page
                // 3rd page
                // pageSize *(pageNumber - 1) = 10 * (3 - 1) = 20
                .skip(20)
                .limit(10)
                .forEach(System.out::println);

        movies.stream()
                //takeWhile: take the element while the condition is true but stop when the condition is false
                .takeWhile(movie -> movie.getLikes() > 10)
                .forEach(System.out::println);

        movies.stream()
                //dropWhile: drop the element while the condition is true but stop when the condition is false
                .dropWhile(movie -> movie.getLikes() > 10)
                .forEach(System.out::println);
    }

}