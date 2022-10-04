package main.learningjava.AdvancedTopic.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void show(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        // Imperative programming (i.e for, if/else, switch/case) ->  We use instructions to specify how
        //something should be done
//        for (int i : list) {
//            System.out.println(i);
//        }

        // Declarative programming (i.e. lambda expression) -> We use expressions to specify what should be done
//        list.forEach(System.out::println);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase = course -> System.out.println(course.toUpperCase());
        //Chaining consumers
        courses.forEach(print.andThen(printUpperCase).andThen(print));

    }
}
