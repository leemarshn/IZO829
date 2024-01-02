package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
        Iterator<String> i = list.iterator();
//        i.next();
        i.forEachRemaining(System.out::println);

    }
}
