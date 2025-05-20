package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength5AndWidth12ThenDaigonal13() {
        double length = 5;
        double width = 12;
        double expected = 13;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength7AndWidth24ThenDaigonal25() {
        double length = 7;
        double width = 24;
        double expected = 25;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision (0.01));
    }

    @Test
    void whenLength13AndWidth31ThenDaigonal33Dot61() {
        double length = 13;
        double width = 31;
        double expected = 33.61;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLegth21AndWidth50ThenDiagonal54Dot23() {
        double length = 21;
        double width = 50;
        double expected = 54.23;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}