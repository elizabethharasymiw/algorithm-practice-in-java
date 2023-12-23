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
}
