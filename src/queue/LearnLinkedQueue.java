package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedQueue {
    public static void main(String [] args)
    {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(24);
        numbers.offer(27);
        numbers.offer(29);
        numbers.offer(45);
        numbers.offer(42);
        numbers.offer(46);

        System.out.println(numbers);
        System.out.println("Peek element : "+numbers.peek());

        System.out.println("Poll element : "+numbers.poll());

        numbers.offer(74);
        numbers.offer(64);
        System.out.println(numbers);
    }
}
