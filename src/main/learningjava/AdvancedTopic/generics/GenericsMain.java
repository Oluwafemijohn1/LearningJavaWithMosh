package main.learningjava.AdvancedTopic.generics;


public class GenericsMain {
    // Java compiler replaces a generic type with the actual type. By defualt it is Object unless
    // we apply a constraint to the parameter type.
    // - use the extends keyword to specify a constraint that accept the type and any of its subclasses
    // - use the super keyword to specify a constraint that accept the type and any of its superclasses
    // - with wildcards, we can use the ? keyword to specify a constraint that accept any type

    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));

        /**
         * To pass a primitive type to a generic class, we need to use a wrapper class
         * */
        //wrapper classes are classes that wrap primitive types
        // e.g
        // int -> Integer
        // float -> Float
        // double -> Double
        // boolean -> Boolean
        // char -> Character
        // byte -> Byte
        // short -> Short
        // long -> Long
        // void -> Void
        var list2 = new GenericList<Integer>();
        GenericList<Integer> list3 = new GenericList<>();
        list2.add(1); // autoboxing or Boxing -> int -> Integer, or Integer.valueOf(1) or new Integer(1) or Integer.parseInt("1")
        list2.add(2);
        list2.get(1); // UnBoxing -> Integer -> int, or Integer.intValue() or Integer.toString()

//        var list4 = new GenericListWithRestrictions<User>();

        var user1 = new User(10);
        var user2 = new User(20);
        //Comparing obejcts
        if(user1.compareTo(user2) > 0)
            System.out.println("User1 is greater than User2");
         else if(user1.compareTo(user2) < 0)
            System.out.println("User1 is less than User2");
        else
            System.out.println("User1 is equal to User2");
        System.out.println(Utils.max(user1, user2));
        var anyything = new GenericList<User>();
        anyything.add(user1);
        anyything.add(user2);
        //Wildcards usage in generic method
        Utils.printUsers(anyything);
    }
}
