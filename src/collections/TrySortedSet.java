package collections;

import java.util.*;

/**
 * Created by Lee N on 03, Wed,Jan,2024.
 */
public class TrySortedSet {

    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(23);
        nums.add(235);
        nums.add(123);
        nums.add(100);
        nums.add(623);
        nums.add(923);
        nums.add(323);
        nums.add(17);
        nums.add(50);

        int n = 100;
        int start = 50;
        int end = 150;
        System.out.println("HeadSet:" + nums.headSet(n)); //elements below given element
        System.out.println("Subset:"  + nums.subSet(start,end)); //elements between start to end inclusive
        System.out.println("TailSet:" + nums.tailSet(n)); //elements from start to end
        System.out.println("First:"   + nums.last()); //smallest element
        System.out.println("Last:"    + nums.first());//largest element


    }
}
