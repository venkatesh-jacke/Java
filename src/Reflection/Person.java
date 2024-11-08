package Reflection;

public class Person  {

    private String name;
   public int age;
    private String sex;

    public Person(){

    }

    public Person(String name, int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex=sex;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    private static void display(){
        System.out.println("I am a static method in Person");
    }
    private void show(){
        System.out.println("I am a non-static method in Person");
    }


    void welcome(String name){
        System.out.println("welcome "+name);
    }
}
