import java.util.HashMap;

public class subarraysWithSumEqualsK {

    public static int subarraySum(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            int prevSum = prefixSum - k;
            if(map.containsKey(prevSum)){
                cnt += map.get(prevSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return cnt;
    }

    public static void main(String[] args){
        int nums[] = {3,-3,1,1,1};
        int k = 3;
        int res = subarraySum(nums, k);
        System.out.println(res);

    }
}
