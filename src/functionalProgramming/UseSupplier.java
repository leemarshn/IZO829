package functionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Created by Lee N on 29, Fri,Dec,2023.
 */
public class UseSupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate localDate = LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(localDate);


        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();

        System.out.println(a1);





    }
}
