public class noOfBitsToBeFlipped { // Count number of bits to be flipped to convert A to B

    public static void main(String[] args) {
        int A = 29; // Binary: 11101
        int B = 15; // Binary: 01111
        
        int xorResult = A ^ B; // XOR will give bits that are different
        int count = 0;
        
        while (xorResult != 0) {
            count += (xorResult & 1); // Increment count if last bit is set
            xorResult >>= 1; // Right shift to check next bit
            // xorResult = xorResult & (xorResult - 1); // Remove the last set bit
            // count++;
        }
        
        System.out.println("Number of bits to be flipped: " + count); // Output: 2
    }
    
}