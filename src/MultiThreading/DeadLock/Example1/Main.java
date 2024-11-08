package MultiThreading.DeadLock.Example1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main is started");
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired");
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("main is ended");
    }
}
