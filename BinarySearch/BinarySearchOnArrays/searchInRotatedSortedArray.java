package BinarySearchOnArrays;
// This searchInRotatedSortedArray is valid only if array  has no duplicates, 
// This problem also work for duplicates for some cases, for some cases it doesn't work
// To perform searchInRotatedSortedArray wit duplicates check out searchInRotatedSortedArray2.java

public class searchInRotatedSortedArray {

    public static int searchTarget(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;

            // Identify the sorted side of array and perform binary search
            if(arr[low] <= arr[mid]){ // If this condition satisfies, the array from low to mid is sorted
                if(arr[low] <= target && target <= arr[mid]){ // If this condition satisfies, 
                    high = mid - 1; // the target lies between low and mid -> (left side) move high to left
                }else{
                    low = mid +1;
                }
            }
            else{ // if 'if' statement does not satisfies, then the array from mid to high is sorted
                 if(arr[mid] <= target && target <= arr[high]){ // If this condition satisfies, 
                    low = mid + 1; // the target lies between mid and high -> (right side) move low to right
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr =  {6,7,8,1,2,3,4,5};
        int target = 8;
        int index = searchTarget(arr, target);
        if(index == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("The target found at index : "+index);
        }
    }
}
