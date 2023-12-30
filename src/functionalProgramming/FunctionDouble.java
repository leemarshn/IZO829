package functionalProgramming;

import java.util.function.DoubleFunction;

/**
 * Created by Lee N on 30, Sat,Dec,2023.
 */
public class FunctionDouble {
    public static void main(String[] args) {
        DoubleFunction<Double> by_two = (k) -> k/2;

        System.out.println(by_two.apply(52.2));
    }
}
