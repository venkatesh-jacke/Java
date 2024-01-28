public class BitManipulation {
    public static void main(String[] args) {
        leftShift();
        rightShift();
        countSetBits(3);
    }

    static void leftShift() {
        int n = 5;
        int i = 1;
        System.out.println("Left Shift");
        System.out.println(n << i);
    /*    Left shift will multiply the number by 2
           N is the number and I is the no of bits to be shifted
     */

    }

    static void rightShift() {
        int n = 5;
        int i = 1;
        System.out.println("Right Shift");
        System.out.println(n >> i);
/*         Right shift will divide the number by 2
           N is the number and I is the no of bits to be shifted
 */

    }

    static void countSetBits(int n) {
        //setBits is nothing a no of 1's in a given binary number.
        int noOfSetBits = 0;
        System.out.println("No of SetBits in " + n);
        while (n > 0) {
            noOfSetBits += n & 1; // n & 1 will give us if there is any setBit in the position 0, If any add the count
            n >>= 1; //make a right shift of each bit after to chk the next position
        }
        System.out.println(noOfSetBits);
    }
}
