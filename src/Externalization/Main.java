package Externalization;

import Seriaization.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee ram = new Employee("Ram", 25, "male");
        Employee sita = new Employee("Sita", 25, "female");


        //Serialize only the name and id
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("externalization.txt"));
            objectOutputStream.writeObject(ram);
            objectOutputStream.writeObject(sita);
            System.out.println("serialize Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //making it to null so the object is destroyed

        ram = null;
        sita = null;


        //De-Serialize   only the name and id
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("externalization.txt"));

            Employee e1 = (Employee) objectInputStream.readObject();
            Employee e2 = (Employee) objectInputStream.readObject();

            System.out.println(e1.name + " " + e1.id + " " + e1.sex);
            System.out.println(e2.name + " " + e2.id + " " + e2.sex);


            System.out.println("Deserialize success");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
