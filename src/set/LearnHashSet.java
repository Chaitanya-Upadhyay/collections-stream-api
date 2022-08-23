package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {

    public static void main(String[] args)
    {
        Set<Integer> set= new HashSet<>();
//        Set<Integer> set =new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();

        set.add(24);
        set.add(54);
        set.add(74);
        set.add(26);
        set.add(72);
        set.add(64);

        System.out.println(set);
        set.remove(24);
        System.out.println(set);
        System.out.println(set.contains(72));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}
