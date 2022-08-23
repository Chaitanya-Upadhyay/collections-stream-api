package map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> value= new java.util.TreeMap<>();

        //Inserting values to the tree map
        value.put("second",2);
        value.put("three",3);
        value.put("four",4);
        value.put("five",5);
        value.put("one",1);
        System.out.println(value);

        //Replacing the values
        value.replace("first",15);
        value.replace("one",25);
        System.out.println(value);

        //Removing the value
        int removeVal=value.remove("three");
        System.out.println("Value Remove : "+removeVal);
        System.out.println(value);


    }
}
