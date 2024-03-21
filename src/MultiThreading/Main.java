package MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        Work w1= new Work("one");
        Work w2= new Work("two");
        Work w3= new Work("three");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Main Thread exiting....");
    }

    static class Work implements  Runnable{
       String name;
       Thread t;


        public Work(String name) {
            this.name=name;
            t= new Thread(this,name);
            System.out.println("Start: "+t);
            t.start();
        }

        @Override
        public void run() {
            try{
                for(int i=1;i<=5;i++){
                    System.out.println(name+": "+i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+": " +"exiting");

        }
    }
}
