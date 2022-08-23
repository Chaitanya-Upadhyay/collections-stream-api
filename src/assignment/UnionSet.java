package assignment;

import java.util.Set;
import java.util.TreeSet;

public class UnionSet {

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
        set2.add(34);
        set2.add(74);

        //Union of two set
        set1.addAll(set2);
        System.out.println(set1);
    }
}
