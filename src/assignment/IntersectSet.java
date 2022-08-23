package assignment;

import java.util.Set;
import java.util.TreeSet;

public class IntersectSet {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(4);
        set1.add(7);
        set1.add(2);
        set1.add(9);
        set1.add(3);
        set1.add(1);


        Set<Integer> set2 = new TreeSet<>();
        set2.add(42);
        set2.add(4);
        set2.add(2);
        set2.add(47);

        set1.retainAll(set2);
        System.out.println(set1);


    }
}
