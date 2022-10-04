package main.learningjava.AdvancedTopic.lambda;

public class LambdaAndMethodReferenceDemo {

    public LambdaAndMethodReferenceDemo(String message) {
        System.out.println(message);
    }

    private static String prefix1 = "_ ";
    public static void show() {
        // Anonymous class
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        printer.print("Hello");

        // Lambda expression
        Printer printer2 = message -> System.out.println(message);
        printer2.print("Hello");

        // Lambda expression
        Printer printer3 = message -> {
            System.out.println(message);
        };
        printer3.print("Hello");
    }
    public static void show1() {
        var prefix = "- ";
        greet(new ConsolePrinter());
        // Anonymous inner class is used when we don't want to explicitly
        // create a class to implement an interface
        // Anonymous inner class-> because we are using it inside a methode
        greet(new Printer() {
            @Override
            public void print(String message) {
                 System.out.println("Hello From Anonymous Inner Class");
            }
        });

        // Lambda expression
        // Functional interface can be represented with lambda expression
        greet((message -> {
            System.out.println("Hello From Lambda Expression");
        }));

        greet(message -> System.out.println( prefix + prefix1 + "Hello From Lambda Expression"));
        //method reference is a shorthand for lambda expression
        greet(System.out::println);

        //Instance method reference
        var demo = new LambdaAndMethodReferenceDemo("Hello");
        greet(demo::greetInstance);

        //Constructor reference
        greet(LambdaAndMethodReferenceDemo::new);


        // Lambda expression are essentially object but can be used to represent anonymous functions
    }

    public void greetInstance(String message) {
        System.out.println(message);
    }


    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
