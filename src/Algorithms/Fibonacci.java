package Algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] memoization = new long[n + 1];
        Arrays.fill(memoization, -1);
        System.out.println(fibMemoization(n, memoization));
    }

    // way1 with memoization. O(n)
    private static long fibMemoization(int n, long[] memoization) {
        if(memoization[n] != -1){
            return memoization[n];
        }
        if (n <= 1) {
            return n;
        }
        long result = fibMemoization(n - 1, memoization) + fibMemoization(n - 2, memoization);
        memoization[n] = result;
        return result;
    }

    // way2. O(n)
    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}



















