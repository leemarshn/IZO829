package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class TreeStream {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");

       Map<Integer, List<String>> map = ohMy
                            .collect(Collectors
                            .groupingBy(s -> s.length(), Collectors.toList()));


        var ohMy1 = Stream.of("lions", "tigers", "tigers", "bears");
        TreeSet<String> result1 = ohMy1
                .filter(s -> s.startsWith("t"))
.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result1);

        //System.out.println(map);
    }
}
