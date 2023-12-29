package functionalProgramming;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learnerRef = System.out::println;
        DuckHelper.teacher(sound, learner);
    }
}
