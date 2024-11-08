package Reflection;

class MyClass {
    static {
        System.out.println("SimpleClass staticBlock");
    }

    {
        System.out.println("SimpleClass instance block");
    }

    public MyClass() {
        System.out.println("SimpleClass constructor");
    }

    static void show() {
        System.out.println("SimpleClass static show method");
    }
}