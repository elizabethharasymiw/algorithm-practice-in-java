package org.example;

public class myMath {
    private myMath(){
    }

    /*
     * Factorial, n!
     * 1! = 1 = 1
     * 2! = 1 * 2 = 2
     * 3! = 1 * 2 * 3 = 6
     * 4! = 1 * 2 * 3 * 4 = 24
     */

    // Interative Solution
    static int factorialI(int n){
        int result = n;
        for(int i = 1; i < n; i++) {
            result = result * i;
        }
        return result;
    }

    // Recursive Solution
    static int factorialR(int n){
        if(n == 1)
            return 1;
        return n * factorialR(n - 1);
    }

    /*
    Fibonacci
    F0 = 0
    F1 = 1
    F2 = 1 = F1 + F0
    F3 = 2 = F2 + F1
    F4 = 5 = F3 + F2
    F5 = 8
    F6 = 13
    F7 = 21
     */

    static int fibonacciR(int n){
        if(n == 1)
            return 1;
        if(n == 0)
            return 0;
        if( n < 0)
            return -404;

        return fibonacciR(n - 1) + fibonacciR(n - 2);
    }
}
