package main.learningjava.AdvancedTopic.lambda;

import java.util.function.Function;

public class FunctionInterface {
    public static void show() {
        Function<String, Integer> map = String::length;
        var length = map.apply("Hello World");
//        System.out.println(length);

        //Composing Functions
        // e.g "key:value" -> "key=value" -> "{key=value}"
        Function<String, String> repalceColon = s -> s.replace(":", "=");
        Function<String, String> addBraces = s -> "\"{" + s + "}\"";
        var result = addBraces.compose(repalceColon).apply("key:value");
        // or
         var result2 = addBraces.apply(repalceColon.apply("key:value"));
         //or
        var result3 = repalceColon.andThen(addBraces).apply("key:value");
        System.out.println(result + "  " + result2);
    }
}
