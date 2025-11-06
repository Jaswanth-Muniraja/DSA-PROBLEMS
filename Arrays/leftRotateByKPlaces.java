public class leftRotateByKPlaces {
    
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // II . Using Juggling Algorithm
    // public static int[] leftRotate(int[] arr, int k) {
    //     int n = arr.length;
    //     k = k % n; // In case k is greater than n
    //     int[] rotatedArr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         rotatedArr[(i - k + n) % n] = arr[i];
    //     }
    //     return rotatedArr;
    // }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        leftRotate(arr, k);
        // arr = leftRotate(arr, k); // II Method
        System.out.print("Array after left rotation by " + k + " places: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}