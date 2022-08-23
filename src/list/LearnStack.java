package list;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args)
    {
        Stack<Integer> stack= new Stack<>();
        stack.add(45);
        stack.push(24);
        stack.add(34);
        stack.add(54);
        System.out.println(stack);
        //Push operation
        stack.push(94);
        System.out.println(stack);

        //Sorting by defaults in ascending order
        Collections.sort(stack);
        System.out.println("Ascending order sorting :"+stack);

        //Sorting in descending order
        Collections.sort(stack,Collections.reverseOrder());
        System.out.println("Descending order sorting:"+stack);

        //Pop operation
        System.out.println(stack.pop());
        System.out.println(stack);

        //Peek operation
        System.out.println(stack.peek());

    }
}
