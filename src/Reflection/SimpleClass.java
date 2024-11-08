package Reflection;

public class SimpleClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show();
        MyClass.show();

    }

}


/*

MyClass myClass = new MyClass();
myClass.show();

SimpleClass staticBlock
SimpleClass instance block
SimpleClass constructor
SimpleClass static show method

MyClass.show()
SimpleClass staticBlock
SimpleClass static show method

*/
