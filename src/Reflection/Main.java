package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("Reflection.Person");  //loaded the class
        Person person = (Person) clazz.newInstance(); //create the object
        System.out.println("==============================================");
        //Constructors
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("==============================================");

        Field[] fields = clazz.getFields();  //this gives only public variables
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==============================================");

        Field[] declaredFields = clazz.getDeclaredFields();  //this gives all variables including private
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("==============================================");

        Method[] methods = clazz.getMethods();  //It includes all the methods in Object class also
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("==============================================");

        Method staticMethod = clazz.getDeclaredMethod("display",null);  //no params so null
        staticMethod.setAccessible(true);  //this flag makes the private methods to accessible
        staticMethod.invoke(null);  //since its a static method i dont need to pass a object so i pass the null


        Method nonStaticMethod = clazz.getDeclaredMethod("show",null);
        nonStaticMethod.setAccessible(true);// since its a private i am making it as accessible
        nonStaticMethod.invoke(person);

        Method welcomeMethod= clazz.getDeclaredMethod("welcome", String.class);
        welcomeMethod.invoke(person,"venkat");
    }


}
