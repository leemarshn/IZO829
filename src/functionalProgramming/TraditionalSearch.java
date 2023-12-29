package functionalProgramming;

import java.util.ArrayList;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canSwim());
        print(animals, q -> q.canHop());

    }
    private static void print(ArrayList<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println(); //irrelevant but issokay
    }
}
