package Interface;

public class Interface {
    public static void main(String[] args) {

    }

    interface Employee{
        double getSalary();
        long getEmployeeId();

        void applyLeave();

    }
    interface Manager extends Employee{
        void assignTas();
        static void conductMeeting(){
            System.out.println("Lets go for a meeting");
        }
    }

    interface Developer extends Manager{
        void writeCode();
    }


}


/*
Interface cannot implement another Interface
Interface cannot extend a Class
Interface can only extend another Interface
Static methods are allowed from Java 8, but we need to have a body for it

default type method is allowed which can have a body and its a common property for all class whic implemnts its interface
*/



