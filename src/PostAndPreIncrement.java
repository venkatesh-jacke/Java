public class PostAndPreIncrement {
    public static void main(String[] args) {
        postIncrement();
        preIncrement();
    }

    static void postIncrement() {
//        1. use the value
//        2. change the value
        int a = 10;
        int b = 0;
        System.out.println("Initially A is " + a + " and B is " + b);
        b = a++;
        System.out.println("Post Increment");
        System.out.println("A is " + a);
        System.out.println("B is " + b);
    }

    static void preIncrement() {
//        1. change the value
//        2. use the value
        int a = 10;
        int b = 0;
        System.out.println("Initially A is " + a + " and B is " + b);
        b = ++a;
        System.out.println("Pre Increment");
        System.out.println("A is " + a);
        System.out.println("B is " + b);
    }
}
