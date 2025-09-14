package BinarySearchOnArrays;

public class findPeakElement {

    public static int peakElement(int[] arr){
        int n = arr.length;
        if(n == 1) return arr[0]; // because we assume before starting of an array as -1, after ending of an array as -1, -1 < arr[0] > -1
        if(arr[0] > arr[1]) return arr[0]; // -1 < arr[0] > arr[1] 
        if(arr[n-1] > arr[n-2]) return arr[n-1]; // arr[n-2] < arr[n-1] -1
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = (low+high)/2;
            if( arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) return arr[mid];
            else if(arr[mid-1] < arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr =  {1,2,1,3,5,6,4}; // 2 or 6
        // int[] arr =  {1,2,1,5,1}; // 2 or 5
        // int[] arr = {1,2,5,4,3}; // 5
        // int[] arr = {1,2,3,4,5}; // 5
        // int[] arr = {5,4,3,2,1}; // 5
        int peak = peakElement(arr);
        if(peak == -1){
            System.out.println("No peak Element in the array");
        }else{
            System.out.println("The peak Element in the array is : "+peak);
        }
    }
}
