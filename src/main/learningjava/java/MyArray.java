package main.learningjava.java;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(nums);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        // Method overloading - same method name but different parameters
        // Method overloading - same method name but different return types
        // Method overloading - same method name but different access modifiers

        // another way to create an array
        int[] nums2 = {1, 2, 3, 4, 5, 6};
//        Arrays.sort(nums2);
        System.out.println(Arrays.toString(Arrays.stream(nums2).sorted().toArray()));
        System.out.println(Arrays.toString(nums2));



        //to dimensional array
        int[][] nums3 = new int[3][3];
        nums3[0][0] = 1;
        nums3[0][1] = 2;
        nums3[1][0] = 3;
        System.out.println(Arrays.deepToString(nums3));

        //three dimensional array
        int[][][] nums4 = new int[3][3][3];
        nums4[0][0][0] = 1;
        nums4[0][0][1] = 2;
        nums4[0][1][0] = 3;
        nums4[1][0][0] = 4;
        System.out.println(Arrays.deepToString(nums4));


        //another way to create a two dimensional array
        int[][] nums5 = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        System.out.println(Arrays.deepToString(nums5));

    }
}
