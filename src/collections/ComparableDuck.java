package collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class ComparableDuck implements Comparable<ComparableDuck> {
    private String name;
    public ComparableDuck(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
        public int compareTo(ComparableDuck d) {
            return name.compareTo(d.name); // sorts ascendingly by name
        }
        public static void main(String[] args) {
            var ducks = new ArrayList<ComparableDuck>();
            ducks.add(new ComparableDuck("Quack"));
            ducks.add(new ComparableDuck("Duck Duck"));
            ducks.add(new ComparableDuck("Puddles"));
            ducks.add(new ComparableDuck("Go Duck"));
            Collections.sort(ducks);

            System.out.println(ducks);
    }
}
