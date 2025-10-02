public class checkSubsequenceWithSumK {

    public static boolean checkSubsequences(int[] arr, int idx,int sum, int k){
        if( sum == k){
            return true;
        }
        if(idx >= arr.length){
            return false;
        }
        return checkSubsequences(arr, idx+1, sum+arr[idx], k) || checkSubsequences(arr, idx+1, sum, k);
    }

    // II Method
    // public static boolean check(int ind, int sum, int[] arr) {
    //     if (sum == 0) return true;
    //     if (sum < 0 || ind == arr.length) return false;
    //     return check(ind + 1, sum - arr[ind], arr) || check(ind + 1, sum, arr);
    // }

    // public static boolean checkSubsequenceWithTargetSumK(int[] arr, int k) {
    //     return check(0, k, arr);
    // }


	public static void main(String[] args) {
	    int[] arr = {3,1,2};
        int k = 3;
        boolean isExists = checkSubsequences(arr,0,0,k);
        // boolean isExists = checkSubsequenceWithTargetSumK(arr,k);
        if(isExists){
            System.out.println("There is a Subsequence in the array with given sum k.");
        }else{
            System.out.println("No Subsequence present in the array with given sum k.");
        }
	}

}
