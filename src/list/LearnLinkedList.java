package list;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args)
    {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(45);
        list.add(78);
        list.add(47);
        list.add(24);
        System.out.println(list);

        // //Sorting by defaults in ascending order
        Collections.sort(list);
        System.out.println("Ascending order sorting:"+list);

        //remove
        list.remove(2);
        System.out.println(list);



        //contains ->returns presence of specific elements in list in the boolean form
        System.out.println( list.contains(45));
        System.out.println("------------------------------------");

        //hashCode
        System.out.println(list.hashCode());

    }
}
