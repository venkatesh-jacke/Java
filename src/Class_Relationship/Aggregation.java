package Class_Relationship;

public class Aggregation {
    public static void main(String[] args) {
        Student e1 = new Student("venki");
        Student e2 = new Student("Atul");
        Student[] employees = new Student[2];
        employees[0] = e1;
        employees[1] = e2;
        Department science = new Department("science", employees);


    }

    static class Department {
        String name;
        Student[] employees;

        Department(String name, Student[] student) {
            this.name = name;
            this.employees = student;
        }

    }

    static class Student {
        String name;

        Student(String name) {
            this.name = name;

        }
    }
}

/*

It's two or more objects in which each object has its own life cycle but there exists an ownership as well.
aggregation can involve a one-to-one, one-to-many, or many-to-many relationship between the participating objects.
we may say that it is a redundant relationship.
If a Employee's department is department is destroyed still Employee object could live on and vice versa.
In Aggregation, both entries can survive individually which means ending one entity will not affect the other entity.

*/
