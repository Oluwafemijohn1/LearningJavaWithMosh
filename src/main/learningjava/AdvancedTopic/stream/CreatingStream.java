package main.learningjava.AdvancedTopic.stream;

import java.util.stream.Stream;

public class CreatingStream {
    public static void show(){
        var stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);

        var stream2 = Stream.iterate(1, n -> n + 1);
        stream2.limit(10).forEach(System.out::println);

        var stream3 = Stream.generate(Math::random);
        stream3.limit(10).forEach(System.out::println);


    }
}
