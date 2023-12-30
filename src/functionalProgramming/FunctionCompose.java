package functionalProgramming;

import java.util.function.Function;

/**
 * Created by Lee N on 30, Sat,Dec,2023.
 */
public class FunctionCompose {
    public static void main(String[] args) {
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined = before.compose(after);
        System.out.println(combined.apply(3));
//
    }
}
