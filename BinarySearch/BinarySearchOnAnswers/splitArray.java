// Same problem as bookAllocationProblem and Painters partition
// Split Array - LargestSum
class splitArray{

     public static int findMinMAxSum(int[] arr, int arraySplits) {
        if(arr.length < arraySplits) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int page : arr){
            low = Math.max(low,page);
            high += page;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int noOfSubArrays = noOfSubArrays(arr,mid);
            if( noOfSubArrays > arraySplits){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int noOfSubArrays(int[] arr, int maxSum){
        int n = arr.length;
        int subArrays = 1;
        int subArraySum = 0;
        for(int i=0; i<n; i++){
            if(subArraySum + arr[i] <= maxSum){
                subArraySum += arr[i];
            }else{
                subArrays ++;
                subArraySum = arr[i];
            }
        }
        return subArrays;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int arraySplits = 2;
        int minMaxSum = findMinMAxSum(arr, arraySplits);
        System.out.println(minMaxSum);
    }
}