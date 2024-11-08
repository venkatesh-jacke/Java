abstract class MotorBike {
    abstract void brake();
    public static void printb(){
        System.out.println("hello");
    }
}

class SportsBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}

public class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike();
        // m1.brake();
        MountainBike.printb();
        SportsBike s1 = new SportsBike();
        // s1.brake();
    }
}