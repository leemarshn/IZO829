package functionalProgramming;

import java.util.function.Function;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class FunctionalFibonacci {
    public static void main(String[] args) {
        Function<Integer, Integer> series = (k) -> {
             if (k <= 1) {
                return k;
            } else {
                int fib = 0, prev1 = 1, prev2 = 0;
                for (int i = 2; i <= k; i++) {
                    fib = prev1 + prev2;
                    prev2 = prev1;
                    prev1 = fib;
                }
                return fib;
            }
        };
        int k = 9;
        for (int i=0; i<=k; i++){
            System.out.println(series.apply(i));
        }
    }
}
