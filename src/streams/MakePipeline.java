package streams;

import java.util.List;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class MakePipeline {
    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");

        list.stream()
//                .filter(n -> n.length() == 4)
                .sorted()
//                .limit(2)
                .forEach(System.out::println);
    }
}
