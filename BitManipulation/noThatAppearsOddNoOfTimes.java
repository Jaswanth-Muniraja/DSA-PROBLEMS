public class noThatAppearsOddNoOfTimes { // Find the number that appears odd number of times in an array
    // single Number that appears odd number of times

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3}; // 3 appears odd number of times
        
        int result = 0;
        for (int num : arr) {
            result ^= num; // XORing all elements
        }
        
        System.out.println("Number that appears odd number of times: " + result); // Output: 3
    }
    
}