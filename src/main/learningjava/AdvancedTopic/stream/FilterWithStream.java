package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class FilterWithStream {
    //Categories of operations
    //1. Intermediate operations:
    //  - map
    //  - filter
    //  - flatMap
    //  - distinct
    //  - sorted
    //  - peek
    //  - limit
    //  - skip
    //2. Terminal operations:
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
        var movies = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION), new Movie("c", 30, Genre.ACTION));
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .forEach(System.out::println);
    }
}
