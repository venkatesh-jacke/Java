package MultiThreading.Synchronization.Example3;

import java.util.LinkedList;
import java.util.Queue;

public class BlockQueue {
    private final Queue<Integer> q;
    private final int capacity;

    public BlockQueue(int capacity) {
        this.capacity = capacity;
        this.q = new LinkedList<>();
    }

    public synchronized boolean add(int val) {
        while (q.size() == capacity) {
            try {
                System.out.println("Queue is full, waiting to add: " + val);
                wait(); // Wait on the BlockQueue instance, not q
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        q.add(val);
        System.out.println("Added: " + val);
        notifyAll(); // Notify all waiting threads that an item was added
        return true;
    }

    public synchronized Integer remove() {
        while (q.size() == 0) {
            try {
                System.out.println("Queue is empty, waiting to remove");
                wait(); // Wait on the BlockQueue instance, not q
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }
        int val = q.poll();
        System.out.println("Removed: " + val);
        notifyAll(); // Notify all waiting threads that an item was removed
        return val;
    }
}
