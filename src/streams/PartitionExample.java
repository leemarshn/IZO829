package streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class PartitionExample {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));

        System.out.println(map);
    }
}
