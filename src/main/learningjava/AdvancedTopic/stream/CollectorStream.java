package main.learningjava.AdvancedTopic.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorStream {
    public static void show(){
        var movies = List.of(
                new Movie("a", 10, Genre.ACTION),
                new Movie("b", 20, Genre.COMEDY),
                new Movie("c", 30, Genre.HORROR));
        var result =  movies.stream().collect(Collectors.toSet());

        var result2 = movies.stream().collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println("result2 " + result2);

        //If I want the actual movie to be the value, I can either use
        // 1.
        var result3 = movies.stream().collect(Collectors.toMap(Movie::getTitle, movie -> movie));
        // 2.
        var result4 = movies.stream().collect(Collectors.toMap(Movie::getTitle, Function.identity()));

        //Summing numbers
        var result5 = movies.stream()
                .filter(movie -> movie.getLikes() > 20)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("result5 " + result5  );

        var result6 = movies.stream()
                .filter(movie -> movie.getLikes() > 20)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("result6 " + result6  );

        var result7 = movies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("result7 " + result7);
    }
}
