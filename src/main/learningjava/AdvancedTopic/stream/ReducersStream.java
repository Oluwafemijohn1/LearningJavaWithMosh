package main.learningjava.AdvancedTopic.stream;

import java.util.Comparator;
import java.util.List;

public class ReducersStream {
    //  - forEach
    //  - forEachOrdered
    //  - toArray
    //  - reduce
    //  - collect
    //  - min
    //  - max
    //  - count
    //  - anyMatch
    //  - allMatch
    //  - noneMatch
    //  - findFirst
    //  - findAny
    //  - iterator
    public static void show(){
        var movies = List.of(
                new Movie("a", 10, Genre.COMEDY),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.LOVE));
        var result1 = movies.stream().count();
        System.out.println( "Result1" + result1);

        var result2 = movies.stream()
                .reduce(0, (carry, movie) -> carry + movie.getLikes(), Integer::sum);
        System.out.println( "Result2" + result2);

        var result3 = movies.stream()
                .allMatch(movie -> movie.getLikes() > 20);
        System.out.println( "Result3" + result3);

        var result4 = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20);
        System.out.println( "Result4" + result4);

        var result5 = movies.stream()
                .noneMatch(movie -> movie.getLikes() > 20);
        System.out.println( "Result5" + result5);

        var result6 = movies.stream()
                .findFirst();
        System.out.println( "Result6 " + result6);

        var result7 = movies.stream()
                .findAny().get();
        System.out.println( "Result7 " + result7);

        var result8 = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println( "Result8 " + result8);

        var result9 = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        //or

        var result10 = movies.stream()
                .map(Movie::getLikes)
                .reduce(Integer::sum)
                .get();
        // this may throw an exception if the stream is empty
        //hence we use

        var result11 = movies.stream()
                .map(Movie::getLikes)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println( "Result9 " + result11);
    }
}
