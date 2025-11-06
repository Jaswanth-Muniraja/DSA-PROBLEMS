public class CheckIfArrayIsSortedAndRotated {
    
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2}; // This array is sorted and rotated
        boolean result = check(nums);
        if( result ) System.out.println("The array is sorted and rotated.");
        else System.out.println("The array is not sorted and rotated.");
    }

}