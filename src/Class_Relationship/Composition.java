package Class_Relationship;

public class Composition {
    public static void main(String[] args) {
        Student s1= new Student("Atul");
        Student s2= new Student("venki");
        Student s3= new Student("Jacke");
        Student s4= new Student("James");
        Student[] cse_students = new Student[2];
        Student[] eee_students = new Student[2];
        cse_students[0]=s1;
        cse_students[1]=s2;
        eee_students[0]=s3;
        eee_students[1]=s4;

        Department cse= new Department("computer science",cse_students);
        Department eee= new Department("social",eee_students);
        Department[] departments=new Department[2];
        departments[0]=cse;
        departments[1]=eee;
        College college= new College("VelTech",departments);


    }


    //Example 2
    static class College{
        String name;
        Department[] departments;

        public College(String name, Department[] departments) {
            this.name = name;
            this.departments = departments;
        }
    }
    static class Student{
        String name;

        public Student(String name) {
            this.name = name;
        }
    }

    static class Department{
        String name;
        Student[] student;

        public Department(String name, Student[] student) {
            this.name = name;
            this.student = student;
        }
    }

    //Example 2
   static class Vehicle{
        Tyre tyre;
        Engine engine;

        public Vehicle(Tyre tyre, Engine engine) {
            this.tyre = tyre;
            this.engine = engine;
        }
    }
    static class Tyre{
        String companyName;

        public Tyre(String companyName) {
            this.companyName = companyName;
        }
    }
    static class Engine{
        String type;

        public Engine(String type) {
            this.type = type;
        }
    }
}




/*
College has a departments and Department has a Students
If college is destroyed than students and departments are destroyed
They have similar life cycle and tight coupling.


Example 2

Vehicle will have tyre and engine
If vehicle itselfs destroyed than tyre and engine also gets destroyed.


*/
