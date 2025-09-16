package BinarySearchOnAnswers;

public class smallestDivisorGivenAThreshold {

    public static int smallestDivisor(int[] nums, int threshold){
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : nums){
            high = Math.max(num, high);
        }
        while( low <= high){
            int mid = (low+high)/2;
            if(isWithInThreshold(nums, mid, threshold)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean isWithInThreshold(int[] nums, int divisor, int threshold){
        int sum = 0;
        for(int num : nums){
            sum += (num+divisor-1)/divisor; // Ceil value
        }
        return sum <= threshold;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int smallestDivisor = smallestDivisor(nums, threshold);
        System.out.println(smallestDivisor);
    }
}
