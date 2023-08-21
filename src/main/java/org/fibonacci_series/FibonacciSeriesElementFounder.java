package org.fibonacci_series;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesElementFounder {
    private static final  List<Long> memo = new ArrayList<>();

//                          Усі обчислення виконую для n = 6;

//    Часова складність O(n)  - 6
//    Просторова складність O(1) -1
    public long getFibonacciNumIteration(int n){
        long firstEl = 0;
        long nextEl = 1;
        long buf;
        for (int i = 0; i < n; i++){
            buf = firstEl + nextEl;
            firstEl = nextEl;
            nextEl = buf;
        }
        return firstEl;
    }

//    Часова складність O(2^n)  - 64
//    Просторова складність O(n) - 6
    public long getFibonacciNumRecursive(int n){
        if (n <= 1) {
            return n;
        }
        return getFibonacciNumRecursive(n - 2) + getFibonacciNumRecursive(n - 1);
    }


//    Часова складність O(n)  - 6
//    Просторова складність O(n) - 6
    public long getFibonacciNumDynamic(int n){
        if (memo.size() > n){
            return memo.get(n);
        }
        long res = 0;
        for (int i = 1; i <= n; i++){
            res = getFibonacciNumIteration(i);
            memo.add(res);
        }
        return res;
    }
}
