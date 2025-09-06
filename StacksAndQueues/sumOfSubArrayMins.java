import java.util.*;

public class sumOfSubArrayMins {

    public static int sumSubarrayMins(int[] arr) {
        long total = 0;
        long MOD = (long) 1000000007; // To avoid integer overflow
        int[] nse = nextSmallerEle(arr);
        int[] pse = previousSmallerEle(arr);
        for (int i = 0; i < arr.length; i++) {
            int rightLength = nse[i] - i;
            int leftLength = i - pse[i];

            long sum = (leftLength * rightLength) % MOD;
            sum = (sum * arr[i]) % MOD;
            total = (total + sum) % MOD;
        }
        return (int) total;
    }

    public static int[] nextSmallerEle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    public static int[] previousSmallerEle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] pse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int result = sumSubarrayMins(arr);
        System.out.println("Sum of Subarray Minimums: " + result);
    }
}
