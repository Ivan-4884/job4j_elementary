package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int factorial = Factorial.calc(5);
        int expected = 120;
        assertThat(factorial, is(expected));
    }

    @Test /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    public void whenCalculateFactorialForZeroThenOne() {
        int factorial = Factorial.calc(0);
        int expected = 1;
        assertThat(factorial, is(1));
    }
}