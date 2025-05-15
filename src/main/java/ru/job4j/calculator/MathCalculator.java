package ru.job4j.calculator;

import static java.lang.Double.sum;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumSubsctractAndDivide(double first, double second) {
        return divide(first, second) + subsctract(first, second);
    }

    public static double sumMultiplyAndSubsctractAndDivideAndPlus(double first, double second) {
        return multiply(first, second) + subsctract(first, second) + divide(first, second) + plus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumSubsctractAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumMultiplyAndSubsctractAndDivideAndPlus(10, 20));
    }
}
