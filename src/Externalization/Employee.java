package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    String name;
    int id;
    transient String sex;  //this will not serialize

    public Employee(String name, int id,String sex) {
        this.name = name;
        this.id = id;
        this.sex=sex;
    }

    public Employee(){
        //We need a No-Arg constructor for Externalization if not it will throw an exception
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return id;
    }

    public void setAge(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    //Write the object decide what needs to be serialized
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name); // Write name as UTF-8 encoded string
        out.writeInt(id);
    }


    //Read the object decide what is serialized
    @Override
    public void readExternal(ObjectInput in) throws IOException {
        name = in.readUTF(); // Read name as UTF-8 encoded string
        id = in.readInt();
    }
}

