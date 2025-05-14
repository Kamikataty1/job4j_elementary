package ru.job4j.calculator;

import static java.lang.Double.sum;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {


    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumRaznAndDelen(double first, double second) {
        return delen(first, second) + razn(first, second);
    }

    public static double sumMultiplyAndRaznAndDelenAndPlus(double first, double second) {
        return multiply(first, second) + razn(first, second) + delen(first,second) + plus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumRaznAndDelen(10, 20));
        System.out.println("Результат расчета равен: " + sumMultiplyAndRaznAndDelenAndPlus(10, 20));
    }
}
