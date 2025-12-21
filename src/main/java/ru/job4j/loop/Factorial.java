package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int i = result; i <= number; i++) {
            if (i > 0) {
                result = result * i;
            }
        }
        return result;
    }
}