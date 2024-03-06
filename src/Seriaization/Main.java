package Seriaization;

import Externalization.Employee;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person venkat = new Person("venkat", 23, "male");
        Person jacke = new Person("Jacke", 23, "male");



        //Serialize
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serialization.txt"));
            objectOutputStream.writeObject(venkat);
            objectOutputStream.writeObject(jacke);

            System.out.println("serialize Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //making it to null so the object is destroyed
        venkat=null;
        jacke=null;



        //De-Serialize
        try{
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("serialization.txt"));
            Person p1 = (Person) objectInputStream.readObject();
            Person p2 = (Person) objectInputStream.readObject();

            System.out.println(p1.name+" "+p1.age+" "+p1.sex);
            System.out.println(p2.name+" "+p2.age+" "+p2.sex);


            System.out.println("Deserialize success");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
