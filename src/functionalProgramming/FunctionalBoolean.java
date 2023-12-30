package functionalProgramming;

import java.util.function.BooleanSupplier;

/**
 * Created by Lee N on 30, Sat,Dec,2023.
 */
public class FunctionalBoolean {
    public static void main(String[] args) {

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > 5;

        System.out.println(b1.getAsBoolean() + " And " + b2.getAsBoolean());
    }
}
