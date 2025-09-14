package BinarySearchOnArrays;
public class minimumInRotatedSortedArray {

    public static int searchTarget(int[] arr){
        int low = 0;
        int high = arr.length -1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            // Identify the sorted side of array and perform binary search
            if(arr[low] <= arr[mid]){ // If this condition satisfies, the array from low to mid is sorted
                ans = Math.min(ans,arr[low]); // the minimum is at index low
                low = mid + 1; 
            }
            else{ // if 'if' statement does not satisfies, then the array from mid to high is sorted
                ans = Math.min(ans,arr[mid]); // the minimum is at index mid
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr =  {6,7,8,1,2,3,4,5};
        int min = searchTarget(arr);
        System.out.println("The minimum of the Rotated Sorted Array is : "+min);
    }
}
