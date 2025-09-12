public class binarySearch {
    public static int iterativeBinarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            // int mid = low + (high-low)/2; // To avoid Integer overflow, use this method of calculating mid
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

     public static int recursiveBinarySearch(int[] nums, int low, int high, int target){
        if( low > high) return -1;
        int mid = (low+high)/2;
        if(nums[mid] == target) return mid;
        else if (target > nums[mid]) return recursiveBinarySearch(nums, mid+1, high, target);
        return recursiveBinarySearch(nums, low, mid-1, target);
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,4};
        int target = 3;
        int index1 = iterativeBinarySearch(nums,target);
        int index2 = recursiveBinarySearch(nums,0,nums.length-1,target);
        System.out.println("Using iterativeBinarySearch, output : "+index1);
        System.out.println("Using recursiveBinarySearch, output : "+index2);
    }
}
