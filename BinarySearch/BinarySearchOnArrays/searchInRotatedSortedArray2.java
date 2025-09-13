package BinarySearchOnArrays;

// This searchInRotatedSortedArray2 works for both with duplicates and No duplicates in the array

public class searchInRotatedSortedArray2 {

    public static int searchTarget(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){ // id this condition occurs in the array we can't say which side of array is sorted
                low++; // since arr[mid] is not the target, then arr[low] and arr[high] will also be not in this condition       
                high--;  // we avoid this condition until it occurs by moving left one place a head and right one place down
                continue;
            }

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
        int[] arr =  {8, 8, 8, 8, 2, 4, 6, 8};
        int target = 6;
        int index = searchTarget(arr, target);
        if(index == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("The target found at index : "+index);
        }
    }
}
