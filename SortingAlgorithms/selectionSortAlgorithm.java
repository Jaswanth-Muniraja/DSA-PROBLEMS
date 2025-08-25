
public class selectionSortAlgorithm {

     public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
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
        selectionSort(arr,n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
