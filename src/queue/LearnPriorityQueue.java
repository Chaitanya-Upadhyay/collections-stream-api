package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String [] args)
    {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(7);
        pq.offer(9);
        pq.offer(12);
        pq.offer(14);
        System.out.println("Queue:"+pq);

        //Access elements of the Queue
        int peekElement= pq.peek();
        System.out.println(peekElement);

        //Remove elements from the Queue
        int removeElement= pq.remove();
        System.out.println(removeElement);

        //Accessing poll element
        int pollElement=pq.poll();
        System.out.println(pollElement);
    }
}
