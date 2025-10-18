
public class ithBitIsSetOrNot {

    public static void main(String[] args) {
        int number = 10; 
        int i = 2; 
        int mask = 1 << i;
        if ((number & mask) != 0) {
            System.out.println("The " + i + "th bit is set.");
        } else {
            System.out.println("The " + i + "th bit is not set.");
        }
    }

}