package abstract_class;

public class Main {
    public static void main(String[] args) {
        MyHospital myHospital= new MyHospital();
        myHospital.canteen();

        Hospital hospital = new MyHospital();
        hospital.tablets();

    }
    static abstract class Hospital{
        abstract  void icu();
        abstract  void ambulance();
        abstract void billing();

        void tablets(){
            System.out.println("Hospital tablets");
        }

        void injections(){
            System.out.println("Hospital injections");
        }

    }
    static class MyHospital extends Hospital{

        @Override
        void icu() {
            System.out.println("MyHospital Icu");
        }

        @Override
        void ambulance() {
            System.out.println("MyHospital Ambulance");
        }

        @Override
        void billing() {
            System.out.println("MyHospital Billing");
        }

        void canteen(){
            System.out.println("MyHospital Canteen");
        }

    }
}
/*


If anyone one of the method is abstract inside the class than the whole class is an abstract class
Abstract class will not have instance object only the class which it extends can have one
You can refer a abstract class with its subclass object

Main Purpose of abstract is
1.Inherit 2.Achieve Polymorphism



*/
