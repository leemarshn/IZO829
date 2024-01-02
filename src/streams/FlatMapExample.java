package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello world", "how are you");

        List<List<String>> wordLists = words
                .stream()
                .map(s -> Arrays.asList(s.split(" ")))
                .collect(Collectors.toList());

        wordLists.iterator()
                .forEachRemaining(s -> s.iterator()
                .forEachRemaining(ss -> System.out.println(ss)));

        System.out.println("BELOW IS FLATMAP");

        List<String> allWords = words.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());


        allWords.iterator()
                .forEachRemaining(s -> System.out.println(s));

    }
}
