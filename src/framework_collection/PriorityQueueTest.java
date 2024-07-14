package framework_collection;

import java.util.PriorityQueue;

// Figura 16.15: PriorityQueueTest.java
// Programa de teste de PriorityQueue.
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();

        queue.offer(6.0);
        queue.offer(7.0);
        queue.offer(3.0);
        queue.offer(1.0);
        queue.offer(5.0);

        System.out.print("Polling from queue: ");

        while(!queue.isEmpty()){
            System.out.printf("%.1f ", queue.poll());
            queue.poll();
        }

    }
}
