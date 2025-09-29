public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if( low < high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }
    public  static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while( i < j){
            while( arr[i] <= pivot && i <= high - 1) i++; // left of pivot should contain only smaller or equal values than pivot
            while( arr[j] > pivot && j >= low + 1) j--; // right of pivot should contain only greater values than pivot
            if( i < j){                // swap greater ones to right and smaller ones to left side of pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];       // swap pivot to it's correct position that is 'j'
        arr[j] = pivot;          // the right side ones will be greater and left side ones will be smaller than pivot at this position
        return j;                // return pivot position
    }

    public static void main(String[] args){
        int[] arr = {7,47,2,69,8,2,53,25,71,36,5,7,6,95,4};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}