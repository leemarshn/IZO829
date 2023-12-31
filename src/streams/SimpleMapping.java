package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lee N on 31, Sun,Dec,2023.
 */
public class SimpleMapping {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add(" Lee ");
        names.add("Wambui ");
        names.add("Leon ");

        Stream<Integer> trimmedNames = names.stream()
                .map(name -> name.toUpperCase())
                .map(name -> name.trim())
                .map(name -> name.length());
        ArrayList<Integer> goodNames = (ArrayList<Integer>) trimmedNames.collect(Collectors.toList());

        System.out.println(goodNames);
    }
}
