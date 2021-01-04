package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.index0f(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then1() {
        int[] input = {5, 4, 3, 2};
        int value = 1;
        int result = FindLoop.index0f(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}