import java.util.HashMap;
import java.util.Map;

public class twoSum {

    // Brute-force
    // public int[] two_sum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{}; // No pair found
    // }

    public int[] two_sum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int required = target - nums[i];
           if(map.containsKey(required)){
            return new int[]{i,map.get(required)};
           }
           map.put(nums[i],i);
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum solver = new twoSum();
        int[] result = solver.two_sum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found with the target sum.");
        }
    }
}
