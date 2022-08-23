package assignment;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDescOrder {
    public static void main(String[] args)
    {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(1);
        treeSet.add(24);
        treeSet.add(12);
        treeSet.add(2);
        treeSet.add(4);
        System.out.println(treeSet);

            //Descending
            NavigableSet<Integer> desc = ((TreeSet<Integer>) treeSet).descendingSet();

        System.out.println(desc);
    }
}
