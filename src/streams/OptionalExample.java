package streams;

import java.util.Optional;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class OptionalExample {

     public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;

        return Optional.of((double) sum / scores.length);
    }
    public static void main(String[] args) {
        int[] scores = {23,45,66,34,56};

        System.out.println(average(scores).get());
    }
}
