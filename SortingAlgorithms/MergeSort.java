public class MergeSort{

    public static void mergeSort(int arr[], int low, int high) {
        if( low >= high) return;
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge (int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low +1];
        int k = 0;
        int left = low;
        int right = mid+1;
        while( left <= mid && right <= high){
            if( arr[left] <= arr[right]){
                temp[k++] = arr[left];
                left++;
            }else{
                temp[k++] = arr[right];
                right++;
            }
        }
        while( left <= mid){
            temp[k++] = arr[left];
            left++;
        }
        while(right <= high){
            temp[k++] = arr[right];
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }
    }

    public static void main(String[] args){
        int[] arr = {7,47,2,69,8,2,53,25,71,36,5,7,6,95,4};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}