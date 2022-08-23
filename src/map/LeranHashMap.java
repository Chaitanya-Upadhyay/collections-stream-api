package map;

import java.util.HashMap;
import java.util.Map;

public class LeranHashMap {

    public static void main(String[] args) {

        Map<String,Integer> number= new HashMap<>();

        //Insert element to the map
        number.put("one", 1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",5);

        System.out.println(number);

        //Accessing keys of the map
        System.out.println("Keys : "+number.keySet());

        //Accessing values of the map
        System.out.println("Keys : "+number.values());

        //Remove elements from the map
        int val= number.remove("four");
        System.out.println(val);

    }
}
