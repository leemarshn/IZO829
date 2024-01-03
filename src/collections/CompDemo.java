package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
