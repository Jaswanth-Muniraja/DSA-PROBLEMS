//  Nice subarray -> which have exactly k odd numbers in it, in this context
public class countNoOfNiceSubarrays {

    public static int totalSubarraysWithKOdds(int[] arr, int k){
        int count1 = totalSubarraysLessOrEqualToKOdds(arr,k);
        int count2 = totalSubarraysLessOrEqualToKOdds(arr,k-1);
        return count1- count2;
    }

    public static int totalSubarraysLessOrEqualToKOdds(int[] arr, int k){
        int n = arr.length;
        int l = 0, r = 0, count = 0, sum = 0;
        while(r < n){
            sum+=(arr[r]%2);
            while(sum > k){
                sum -= (arr[l]%2);
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,9};
        int k = 3;
        int totalSubarrays = totalSubarraysWithKOdds(arr,k);
        System.out.println(totalSubarrays); //6
    }
}
