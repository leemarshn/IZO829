package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lee N on 31, Sun,Dec,2023.
 */
public class SimpleStream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Stream<String> nameStream = names.stream();

        List<String> filteredNames = nameStream.filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);  // Output: [ALICE]


    }
}
