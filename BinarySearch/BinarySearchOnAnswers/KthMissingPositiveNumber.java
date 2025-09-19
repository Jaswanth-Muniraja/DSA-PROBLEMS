package BinarySearchOnAnswers;

public class KthMissingPositiveNumber {
    
    // Brute Force
    // public static int findKthMissingNumber(int[] arr, int k){
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] <= k) k++;
    //         else return k;
    //     }
    //     return k;
    // }

    public static int findKthMissingNumber(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            int missingNumbers = (arr[mid] - (mid+1)); // let assume mid = 3, and element is 7, but at index 3 the element should be 4(3(index)+1)
            // you got element 7 number of missing elements = (7 - (3+1)) => (7-4) = 3
            if(missingNumbers < k){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return high+k+1;
        // (or) return low +k;

        // high and low end up where the missing element will present in between them in our example the high will end up at 7(i.e. at index 3)
        // low will end up at 11(i.e. at index 4) in our example kth missing number is 9. at 7 there are 3 missing numbers we need two more  
        // we can do arr[high] + more => 7 + 2 =>(arr[high] + (k-missing) => (arr[high] + (k - (arr[high]-(high+1)))) = (7 + (5-(7-(3+1)))) = (7 + (5-(3)))  = (7 + 2) => 9
        // what if high ended at index -1. we can not know missing value. So (arr[high] + (k - (arr[high]-(high+1)))) => arr[high] + k - (arr[high] - high-1)
        // arr[high] + k - arr[high] + high + 1 = k+high+1 = high + k+1 => since high is just one step back of low = > low - 1 + k + 1 => low + k
    }
    

    public static void main(String[] args){
        int[] arr = {2,3,4,7,11,12};
        int k = 5;
        int kthMissingNumber = findKthMissingNumber(arr, k);
        System.out.println("The Kth missing Number in the array is : "+kthMissingNumber);
    }
}