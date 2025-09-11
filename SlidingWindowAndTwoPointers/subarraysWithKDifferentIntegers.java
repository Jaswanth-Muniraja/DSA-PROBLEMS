import java.util.HashMap;

public class subarraysWithKDifferentIntegers {

     public static int totalSubarraysWithKDifferentIntegers(int[] arr, int k){
        int count1 = totalSubarraysLessOrEqualToKDifferentIntegers(arr,k);
        int count2 = totalSubarraysLessOrEqualToKDifferentIntegers(arr,k-1);
        return count1- count2;
    }

    public static int totalSubarraysLessOrEqualToKDifferentIntegers(int[] arr, int k){
        int n = arr.length;
        int l = 0, r = 0, count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < n){
            map.put(arr[r], map.getOrDefault(arr[r],0)+1);
            while(map.size() > k){
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l]) == 0) map.remove(arr[l]);
                l++; 
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,4,5,6};
        int k = 3;
        int totalSubarrays = totalSubarraysWithKDifferentIntegers(arr,k);
        System.out.println(totalSubarrays); //7
    }
}
