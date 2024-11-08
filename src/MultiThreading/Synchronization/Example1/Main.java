package MultiThreading.Synchronization.Example1;

public class Main {
    public static void main(String[] args) {
        CallMe callMe= new CallMe();
        Caller o1= new Caller(callMe,"venkat");
        Caller o2= new Caller(callMe,"Jacke");
        Caller o3= new Caller(callMe,"Android");
    }
    static  class CallMe{
        synchronized void display(String msg){
            System.out.print("["+msg);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.print("]");
        }
    }
    static  class Caller implements Runnable{
        CallMe obj;
        String msg;
        Thread t;

        public Caller(CallMe obj, String msg) {
            this.obj = obj;
            this.msg = msg;
            t=new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            obj.display(msg);
        }
    }
}

/*
Without Synchronization
void display(String msg)
[venkat[Android[Jacke]]]

With Synchronization
synchronized void display(String msg)
[venkat][Android][Jacke]

if you don't need to alter the original method of a class you can place the critical section of a code inside
Synchronized block
synchronized(obj){
//CODE
}
*/
