package main.learningjava.oop;

public class ProceduralProgramming {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }

    private static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
