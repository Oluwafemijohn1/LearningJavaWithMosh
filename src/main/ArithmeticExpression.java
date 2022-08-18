package main;

public class ArithmeticExpression {
    public static void main(String[] args) {
        final float PI = 3.14f;
        final double PI2 = 3.14;
        System.out.println(PI);

        int result = 5 + 3;
        System.out.println(result);
        int result2 = 5 - 3;
        System.out.println(result2);
        int result3 = 5 * 3;
        System.out.println(result3);
        int result4 = 5 / 3;
        System.out.println(result4);
        int result5 = 5/3;

        // An expression is a piece of code that produces a value
        double fraction = (double) 10 / 3; // or
        double fraction2 = (double) 10 / (double) 3; // or
        System.out.println(fraction);

        // increment operator
        int x = 1;
        int y = x++; // y = 1, x = 2 (post increment)
        System.out.println(x + " " + y);
        int a = 1;
        int b = ++a; // b = 2, a = 2 (pre increment)
        System.out.println(a + " " + b);

        // increment more than one value
        int c = 1;
        c = c + 2;
        c += 2; // Augmented assignment operator or compound assignment operator
        System.out.println(c);

        //Arithmetic
        int mats = 2 + 3 * 4 / 2;
        System.out.println(mats);

        //casting
        short short1 = 2;
        int int1 = short1 + 1; // implicit casting -> this can happen from short > long > int > float > double
        System.out.println(int1);

        double double1 = 2.2;
        int int2 = (int) double1 + 3; // explicit casting -> happens with compatible types or when data will not be lost
        System.out.println(int2);

        //converting sting to short, int, long, float, double
        String str = "12";
        int int3 = Integer.parseInt(str) + 1;
        System.out.println("int3 " + int3);
        short short2 = Short.parseShort(str);
        System.out.println(short2);
        long long1 = Long.parseLong(str);
        System.out.println(long1);
        float float1 = Float.parseFloat(str);
        System.out.println(float1);
        double double2 = Double.parseDouble(str);
        System.out.println(double2);



    }

}
