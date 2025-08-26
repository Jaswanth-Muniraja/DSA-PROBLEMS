
public class insertionSortAlgorithm {

     public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n ; i++) {
            int j = i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void printArray(int arr[], int size){
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { 17, 4, 11, 69, 47, 14, 29, 9};
        int n = arr.length;
        insertionSort(arr,n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
