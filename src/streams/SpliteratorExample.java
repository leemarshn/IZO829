package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class SpliteratorExample {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
//        Spliterator<String> s = list.spliterator();
//        s.tryAdvance(System.out::println);
//        System.out.println(" --- bulk traversal");
//        s.forEachRemaining(System.out::println);
//
//        System.out.println(" --- attempting tryAdvance again");
//        boolean b = s.tryAdvance(System.out::println);
//        System.out.println("Element exists: "+b);


        List<String> list2 = Arrays.asList("Apple", "Tomoko", "Banana", "Orange");

        Spliterator<String> s1 = list2.spliterator();
        Spliterator<String> s2 = s1.trySplit();

        s1.forEachRemaining(System.out::println);
        System.out.println("-- traversing the other half of the spliterator --- ");
        s2.forEachRemaining(System.out::println);
    }
}
