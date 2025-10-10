// Given a collection of numbers array and a target number, find all unique combinations in array where the combination numbers sum to target.

// Each number in candidates may only be used once in the combination. (No repetition)

// Note: The solution set must not contain duplicate combinations.

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class combinationSum2 {

     public static List<List<Integer>> findCombinations(int[] arr, int target){
         Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationsSumEqlsTarget(arr, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void findCombinationsSumEqlsTarget(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i<=arr.length; i++){
            if(arr[i] > target) break;
            if(i > index && arr[i-1] == arr[i]) continue; // to avoid duplicate combinations, As array contains duplicates staring with same element again leads to duplicates
            list.add(arr[i]);
            findCombinationsSumEqlsTarget(arr, target-arr[i], i+1, list, ans);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args){
        int[] arr = {10,1,2,7,6,1,5}; // [ [1, 1, 5] [1, 6] [2, 5] [7] ] // observe [6, 1] is also possible but it is [1, 6] if arranged in sorted, which already exits
        int target = 7;
        List<List<Integer>> combinations = findCombinations(arr, target);
        System.out.print("[ ");
        for(List<Integer> list : combinations){
            System.out.print(list+" ");
        }
        System.out.print("]");
    }

}