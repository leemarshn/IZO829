package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class SimpleMap {

    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.forEach((k, v) -> System.out.println(k + "," +v));
    }
}
