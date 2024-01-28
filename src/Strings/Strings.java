package Strings;

public class Strings {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);

        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

 /*       Note:-
                Always use equals() method to compare the content of a string
                "==" compares the reference of an object in a memory

 */

        System.out.println(new String("venki").compareTo(new String("jacke")));
        System.out.println(new String("venki").compareTo(new String("venki")));
        System.out.println(new String("jacke").compareTo(new String("venki")));

 /*
 compareTo() method compares the given string in a lexicographical order and returns the integer value
 s1 > s2   return +ve value
 s1 == s2  returns 0
 s1 < s2  returns -ve value
 */

    }

}
