package MultiThreading.Synchronization.Example2;

public class Stack {
    int capacity;
    int[] arr;
    int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        top = -1;
    }

    public synchronized boolean push(int element) {
        if (isFull()) return false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        arr[++top] = element;
        return true;
    }

    public synchronized int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int element = arr[top];
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        arr[top--] = Integer.MIN_VALUE;
        return element;
    }

    public boolean isFull() {
        return top >= arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
