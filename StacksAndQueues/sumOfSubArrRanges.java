import java.util.*;

public class sumOfSubArrRanges {

    public static long subArrayRanges(int[] arr) {
        long smallerElesTotal = 0;
        long largerElesTotal = 0;
        int[] nse = nextSmallerEle(arr);
        int[] pse = previousSmallerEle(arr);
        int[] nge = nextGreaterEle(arr);
        int[] pge = previousGreaterEle(arr);

        for (int i = 0; i < arr.length; i++) {
            int rightLengthforSmaller = nse[i] - i;
            int leftLengthforSmaller = i - pse[i];
            long sumSmaller = (rightLengthforSmaller * leftLengthforSmaller) * (long)arr[i];
            smallerElesTotal += sumSmaller;

            int rightLengthforLarger = nge[i] - i;
            int leftLengthforLarger = i - pge[i];
            long sumLarger = (rightLengthforLarger * leftLengthforLarger) * (long)arr[i];
            largerElesTotal += sumLarger;
        }
        return largerElesTotal - smallerElesTotal;
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

    public static int[] nextGreaterEle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nge;
    }

    public static int[] previousGreaterEle(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] pge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        long result = subArrayRanges(arr);
        System.out.println("Sum of Subarray Ranges: " + result);
    }
}
