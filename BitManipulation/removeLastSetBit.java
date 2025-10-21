
public class removeLastSetBit { // right most set bit (1 -> 0)

    public static void main(String[] args) {
        int number = 12; // Binary: 1100
        int result = number & (number - 1); // Removes the last set bit
        System.out.println("Number after removing last set bit: " + result); // Output: 8 (Binary: 1000)
    }
    
}