package functionalProgramming;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // You can change this to the desired number of terms in the series
        System.out.println("Fibonacci Series using Iteration:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fib = 0, prev1 = 1, prev2 = 0;
            for (int i = 2; i <= n; i++) {
                fib = prev1 + prev2;
                prev2 = prev1;
                prev1 = fib;
            }
            return fib;
        }
    }
}
