public class MoveZeroesToEnd {

     public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }

    // II Method
    // public static void moveZeroes(int[] arr) {
    //     int n = arr.length;
    //     int nonZeroIndex = 0;

    //     for (int i = 0; i < n; i++) {
    //         if (arr[i] != 0) {
    //             arr[nonZeroIndex++] = arr[i];
    //         }
    //     }

    //     while (nonZeroIndex < n) {
    //         arr[nonZeroIndex++] = 0;
    //     }
    // }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.print("Array after moving zeroes to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}