package Hash_And_equals;

public class ObjectQuality {
    public static void main(String[] args) {
        Song s1 = new Song("Roja", "Arr");
        Song s2 = new Song("Roja", "Arr");
        System.out.println("s1 hashCode "+s1.hashCode());
        System.out.println("s2 hashCode "+s2.hashCode());

        if (s1.hashCode() == s2.hashCode()) System.out.println("Both hashCodes are equal");
        else System.out.println("Both hashCodes Not are equal");
        if (s1 == s2) System.out.println("Both s1 and s2 refers to same object in heap");
        else System.out.println("Both s1 and s2 refers to different object in heap");
        if (s1.equals(s2)) System.out.println("s1 does equals s2");
        else System.out.println("s1 does not equals s2");


        Book b1 = new Book("Java", "Sun");
        Book b2 = new Book("Java", "Sun");

        System.out.println("b1 hashCode "+b1.hashCode());
        System.out.println("b2 hashCode "+b2.hashCode());

        if (b1.hashCode() == b2.hashCode()) System.out.println("Both hashCodes are equal");
        else System.out.println("Both hashCodes Not are equal");
        if (b1 == b2) System.out.println("Both b1 and b2 refers to same object in heap");
        else System.out.println("Both b1 and b2 refers to different object in heap");
        if (b1.equals(b2)) System.out.println("b1 does equals b2");
        else System.out.println("b1 does not equals b2");


    }
}
