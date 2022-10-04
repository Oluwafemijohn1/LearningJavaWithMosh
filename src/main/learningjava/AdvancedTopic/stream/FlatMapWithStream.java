package main.learningjava.AdvancedTopic.stream;

import java.util.List;

public class FlatMapWithStream {
    public static void show(){
        var stream = List.of(List.of(1,2,3), List.of(4,5,6)).stream();
        stream.flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}
