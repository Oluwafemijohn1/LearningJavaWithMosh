package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class ImperativeVsFunctionalProgramming  {
      public static void show() {
            var movies = List.of(new Movie("c", 10), new Movie("b", 20), new Movie("a", 30));

            // Imperative programming -> tell the computer how it should be done
            int count = 0;
            for (var movie : movies)
                if (movie.getLikes() > 10)
                    count++;
            System.out.println( "count " + count);

            // Functional programming -> tell the computer what to do
            var count2 = movies.stream()
                    .filter(movie -> movie.getLikes() > 10)
                    .count();
            System.out.println( "count2 " + count2);


        }
}
