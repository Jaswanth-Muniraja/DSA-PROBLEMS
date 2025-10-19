public class noOfSetBits {

    public static void main(String[] args) {
        int number = 29; 
        int count = 0;
        while (number > 0) {
            count += (number & 1);  // Check the least significant bit
            number >>= 1;  // n = n / 2 // because dividing by 2 shifts bits to right
        }
        System.out.println("Number of set bits: " + count);
    }
}
