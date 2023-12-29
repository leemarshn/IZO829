package functionalProgramming;

import java.util.function.Consumer;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class UseConsumer {
    public static void main(String[] args) {
        Consumer<Integer> kk = (k) -> {
            int j = k * k;
            System.out.println(j);
        };

        kk.accept(23);
    }
}
