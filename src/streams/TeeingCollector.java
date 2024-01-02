package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class TeeingCollector {
    record Separations(String spaceSeparated, String commaSeparated) {}
    public static void main(String[] args) {
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);
    }

}
