package Interface;

public class Interface {
    public static void main(String[] args) {

    }
}


//Interface cannot implement another Interface
/*interface car implements fly{

}*/


//Interface cannot extend a Class
/*interface Car extends Lamborghini{

}*/


interface Employee{
    double getSalary();
    long getEmployeeId();

}
//Interface can only extend another Interface
interface Manger extends Employee{
    void assignTas();

    //Static methods are allowed from Java 8, but we need to have a body for it
    static void conductMeeting(){
        System.out.println("Lets go for a meeting");
    }
    default void greet(){
        System.out.println("Welcome");
    }
}

interface Developer extends Employee{
    void writeCode();
}


