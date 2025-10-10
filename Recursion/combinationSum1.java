
// Given an array of distinct integers and a target integer, return a list of all unique combinations of array where the chosen numbers sum to target

import java.util.List;
import java.util.ArrayList;

public class combinationSum1 {

    public static List<List<Integer>> findCombinations(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationsSumEqlsTarget(arr, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void findCombinationsSumEqlsTarget(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index >= arr.length){
            return;
        }
        if(arr[index] <= target){
            list.add(arr[index]);
            findCombinationsSumEqlsTarget(arr, target-arr[index], index, list, ans);
            list.remove(list.size()-1);
        }
        findCombinationsSumEqlsTarget(arr, target, index+1, list, ans);
    }

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7}; // [ [2, 2, 3] [2, 5] [3, 4] [7] ]
        int target = 7;
        List<List<Integer>> combinations = findCombinations(arr, target);
        System.out.print("[ ");
        for(List<Integer> list : combinations){
            System.out.print(list+" ");
        }
        System.out.print("]");
    }

}