package collections;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class EnumSetExample {

public static void main(String[] args) {
    Set<WeekDay> weekdays = EnumSet.allOf(WeekDay.class);

    boolean isWeekday = weekdays.contains(WeekDay.WEDNESDAY);

    for (WeekDay day : weekdays) {
        System.out.println(day);
    }
    System.out.println(isWeekday);

}

}
