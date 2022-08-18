package main;

public class OperatorsInJava {
    public static void main(String[] args) {
        int income = 100_000;
        boolean myBool = income >= 100_000;
        //tenary operator
        boolean myBool2 = income >= 100_000 ? true : false;
        String className =  income >= 100_000 ? "high income" : "low income";
        System.out.println(className);

        // switch statement
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
                break;
        }

    }
}
