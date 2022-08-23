package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Chaitanya Kumar
 */

public class LearnTreeSet {

    public static void main(String [] args)
    {
        Set<Integer> set = new TreeSet<>();

        set.add(45);
        set.add(42);
        set.add(74);
        set.add(84);
        set.add(24);

        System.out.println(set);

        //Size
        System.out.println(set.size());

        // Empty/not empty
        System.out.println(set.isEmpty());

        Set<Integer> set1 = new TreeSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(7);
        set1.add(8);
        set1.add(24);
        System.out.println(set1);

        //Adding two set
        System.out.println("------------Merging both set-------------");
        set1.addAll(set);
        System.out.println(set1);

        //Calling iterator method
        Iterator<Integer> iterate = set1.iterator();
        System.out.println("TreeSet using Iterator : ");

        // Accessing elements
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

    }
}
