// FloorValue -> smallest element in an array such that where element <= target
// CeilValue -> smallest element in an array such that where element >= target

public class FloorAndCeilValues {

    public static int FloorValue(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] <= target){
                ans = nums[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static int CeilValue(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                ans = nums[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,2,4,4};
        int target = 3; // Floor = 2, Ceil = 4
        // int target = 5; // Floor = 4, Ceil = -1
        // int target = -1; // Floor = -1, Ceil = 1
        int FloorValue = FloorValue(nums, target);
        int CeilValue = CeilValue(nums, target);
        System.out.println("FloorValue : "+FloorValue);
        System.out.println("CeilValue : "+CeilValue);
    }
}