package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class TryNavigableSet {


    public static void main(String[] args) {

        NavigableSet<Integer> nums = new TreeSet<>();
        nums.add(14);
        nums.add(55);
        nums.add(126);
        nums.add(58);
        nums.add(623);
        nums.add(923);
        nums.add(323);
        nums.add(17);
        nums.add(50);
        nums.add(100);
        nums.add(20);

        int e = 20;
        int start = 50;
        int end = 150;
        System.out.println("HeadSet:" + nums.headSet(e, true)); //elements below given element inclusive ifTrue
        System.out.println("ceiling:" + nums.ceiling(e)); // e >= obj return smallest -> it's reverse is floor
        System.out.println("higher:" + nums.higher(e)); // e > obj return smallest -> reverse is lower
        System.out.println("Largest: " + nums.last());
        System.out.println("PollLast:" + nums.pollLast()); // returns largest and removes the element
        System.out.println("Largest: " + nums.last());


    }

}
