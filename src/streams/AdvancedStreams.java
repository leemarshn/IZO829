package streams;

import java.util.ArrayList;

/**
 * Created by Lee N on 02, Tue,Jan,2024.
 */
public class AdvancedStreams {
    public static void main(String[] args) {
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());
        cats.add("KC");
        //System.out.println(stream.count()); Illegall call

    }
}
