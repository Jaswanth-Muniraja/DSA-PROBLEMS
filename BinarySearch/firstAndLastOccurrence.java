class firstAndLastOccurrence{
    public static int firstOccurrenceOfTarget(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid -1;
            }else if(target > arr[mid]) low = mid+1;
            else high = mid - 1; 
        }
        return ans;
    }

    public static int lastOccurrenceOfTarget(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(target > arr[mid]) low = mid+1;
            else high = mid - 1; 
        }
        return ans;
    }

    // Using Lower and Upper Bound
    // public static int firstOccurrenceOfTargetUsingLowerBound(int[] arr, int target){
    //     int n = arr.length;
    //     int low = 0;
    //     int high = n-1;
    //     int ans = n;
    //     while(low <= high){
    //         int mid = (low+high)/2;
    //         if(arr[mid] >= target){
    //             ans = mid;
    //             high = mid -1;
    //         }
    //         else low = mid + 1; 
    //     }
    //     return ans;
    // }
    //  public static int lastOccurrenceOfTargetUsingUpperBound(int[] arr, int target){
    //     int n = arr.length;
    //     int low = 0;
    //     int high = n-1;
    //     int ans = n;
    //     while(low <= high){
    //         int mid = (low+high)/2;
    //         if(arr[mid] >target){
    //             ans = mid;
    //             high = mid - 1;
    //         }
    //         else low = mid + 1; 
    //     }
    //     return ans;
    // }

    public static void main(String[] args){
        int[] arr = {1,3,4,5,8,8,9,9};
        int target = 8;
        int first = firstOccurrenceOfTarget(arr, target);
        if (first == -1){
            System.out.println("Target Not Found");
        }else{
            int last = lastOccurrenceOfTarget(arr, target);
            System.out.println("The Target first occurred at index : "+first);
            System.out.println("The Target last occurred at index : "+last);
        }

        // Using Lower and Upper Bound
        // int first = firstOccurrenceOfTargetUsingLowerBound(arr, target);
        // if (first == -1 || arr[first] != target){
        //     System.out.println("Target Not Found");
        // }else{
        //     int last = lastOccurrenceOfTargetUsingUpperBound(arr, target);
        //     System.out.println("The Target first occurred at index : "+first);
        //     System.out.println("The Target last occurred at index : "+ (last-1));
        // }
    }
}