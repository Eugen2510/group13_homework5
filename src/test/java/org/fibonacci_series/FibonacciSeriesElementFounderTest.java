package org.fibonacci_series;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciSeriesElementFounderTest{
    FibonacciSeriesElementFounder founder;
    @BeforeEach
    public void initElementFounder(){
        founder = new FibonacciSeriesElementFounder();
    }
    @Test
    public void testGetFibonacciNumIteration() {
        long actual = founder.getFibonacciNumIteration(6);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFibonacciNumRecursive() {
        long actual = founder.getFibonacciNumIteration(6);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFibonacciNumDynamic() {
        long actual = founder.getFibonacciNumIteration(6);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}