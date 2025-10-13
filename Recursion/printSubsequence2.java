import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class printSubsequence2 {

    public static List<List<Integer>> findSubsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        allSubsets(arr, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void allSubsets(int[] arr, int index, List<Integer> li, List<List<Integer>> ans){
        ans.add(new ArrayList<>(li));
        for (int i = index; i < arr.length; i++) {
            if(i > index && arr[i-1] == arr[i]) continue;
            li.add(arr[i]);
            allSubsets(arr, i+1, li, ans);
            li.remove(li.size()-1);
        }
    }

    public static void main (String[] args){
        int[] arr = {1,2,2}; // [ [] [1] [1, 2] [1, 2, 2] [2] [2, 2] ] 
        // In this , two [1, 2]'s subsets are possible but only one should be considered, avoid duplicate subsets when sorted
        List<List<Integer>> subsets = findSubsets(arr);
        System.out.print("[ ");
        for(List<Integer> list : subsets){
            System.out.print(list+" ");
        }
        System.out.print("]");
    }

}