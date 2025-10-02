public class countSubsequencesWithSumK {

    public static int countSubsequences(int[] arr, int idx,int sum, int k){
        if( sum == k){
            return 1;
        }
        if(idx >= arr.length){
            return 0;
        }
        return countSubsequences(arr, idx+1, sum+arr[idx], k) + countSubsequences(arr, idx+1, sum, k);
    }

    private int count(int ind, int sum, int[] nums) {
        if (sum == 0) return 1;
        if (sum < 0 || ind == nums.length) return 0;
        return count(ind + 1, sum - nums[ind], nums) + count(ind + 1, sum, nums);
    }

    public int countSubsequenceWithTargetSumK(int[] nums, int k) {
        return count(0, k, nums);
    }


	public static void main(String[] args) {
	    int[] arr = {3,1,2};
        int k = 3;
        int count = countSubsequences(arr,0,0,k);
        // int count = countSubsequenceWithTargetSumK(arr,k);
    	System.out.println("The count of subsequences with their total sum equals to K is : "+ count);
	}

}