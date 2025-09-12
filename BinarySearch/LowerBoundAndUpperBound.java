// LowerBound -> smallest index such that where array[index] >= target
// UpperBound -> smallest index such that where array[index] > target

public class LowerBoundAndUpperBound {

    public static int LowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int UpperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,4};
        int target = 3; // LB = 4, UB = 6 
        // int target = 5; // LB = 8, UB = 8
        // int target = -1; // LB = 0, UB = 0
        int LowerBound = LowerBound(nums, target);
        int UpperBound = UpperBound(nums, target);
        System.out.println("LowerBound : "+LowerBound);
        System.out.println("UpperBound : "+UpperBound);
    }
}