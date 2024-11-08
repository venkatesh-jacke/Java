package MultiThreading.Synchronization.Example3;

public class Main {
    public static void main(String[] args) {
        BlockQueue queue= new BlockQueue(5);
        Thread adder = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                queue.add(i);

            }
        });

        Thread remover = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                queue.remove();
            }
        });
        adder.start();
        remover.start();
    }
}
