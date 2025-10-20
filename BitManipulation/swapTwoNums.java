public class swapTwoNums {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10; 

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a ^ b; // Step 1: a = 5 ^ 10
        b = a ^ b; // Step 2: b = (5 ^ 10) ^ 10 = 5
        a = a ^ b; // Step 3: a = (5 ^ 10) ^ 5 = 10

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

}
