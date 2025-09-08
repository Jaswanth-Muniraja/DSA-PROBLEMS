package SlidingWindowAndTwoPointers;

public class maxConsecutiveOnes {

    public static int max_consecutive_ones(int[] nums, int k){
        int n = nums.length;
        int l =0, r= 0, maxLen = 0, zeroes = 0;
        while(r<n){
            if(nums[r] == 0) zeroes++;
            // while(zeroes > k){
            //     if(nums[l] == 0) zeroes--;
            //     l++;
            // }
            if(zeroes > k){
                if(nums[l] == 0) zeroes--;
                l++;
            }
            if(zeroes <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int res = max_consecutive_ones(nums, k);
        System.out.println(res);
    }
}
