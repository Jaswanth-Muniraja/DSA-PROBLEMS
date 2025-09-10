public class binarySubarraysWithSum {

    public static int totalSubarraysEqualToSum(int[] nums, int goalSum){
        int count1 = totalSubarrayslessOrEqualToSum(nums, goalSum);
        int count2 = totalSubarrayslessOrEqualToSum(nums, goalSum-1);
        return count1 - count2;
    }

    public static int totalSubarrayslessOrEqualToSum(int[] nums, int goalSum){
        if(goalSum < 0) return 0;
        int n = nums.length;
        int l = 0, r = 0, count = 0, sum = 0;
        while(r<n){
            sum += nums[r];
            while(sum > goalSum){
                sum -= nums[l];
                l++; 
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goalSum = 2;

        // int[] nums = {0,0,0,0,0};
        // int goalSum = 0;

        int NoOfSubarrays = totalSubarraysEqualToSum(nums, goalSum);
        System.out.println(NoOfSubarrays);
    }
}
