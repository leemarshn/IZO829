package collections;

import java.util.Comparator;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // Reverse the comparison.
        return bStr.compareTo(aStr);
    }
}
