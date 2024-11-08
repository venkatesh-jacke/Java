package MultiThreading.Synchronization.Example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread is starting...");
        Stack stack = new Stack(5);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Pushing "+stack.push(1));
            }
        }, "t1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Popping "+ stack.pop());
            }
        }, "t2");
        System.out.println("Main Thread is ending...");
        t1.start();
        t2.start();
    }
}
