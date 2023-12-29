package functionalProgramming;

import java.util.function.Predicate;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class PredicateEggs {
    public static void main(String[] args) {
        String s = "Brown Eggs";

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        Predicate<String> egg = s1 -> s.contains("Eggs");
        Predicate<String> brown = s2 -> s.contains("Brown");

        Predicate<String> brownEggs = egg.and(brown);

        System.out.println(brownEggs.test(s));


    }
}
