package org.fibonacci_series;

public class Main {
    public static void main(String[] args) {
        FibonacciSeriesElementFounder founder = new FibonacciSeriesElementFounder();
        long iteration = founder.getFibonacciNumIteration(6);
        long dynamic = founder.getFibonacciNumDynamic(6);
        long recursive = founder.getFibonacciNumRecursive(6);
    }
}
