package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chaitanya Kumar
 */

public class LearnArrayListStream {

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("How are you");
        list.add("How you doing");
        list.add("Amar");
        list.add("Akash");

        System.out.println(list);

        System.out.println("Printing starts with 'How' using Stream ");
        list.stream().filter(str->str.contains("How")).forEach(System.out::println);

        System.out.println("Printing ends with 'r' using Stream ");
        list.stream().filter(str1->str1.endsWith("r")).forEach(System.out::println);

        list.add("Subham");
        list.add("Ashwani");
        System.out.println(list);
    }

}
