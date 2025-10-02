import java.util.ArrayList;
import java.util.List;

public class printSubsequence {

    public static void findSubsequences(int[] arr, int idx,  List<List<Integer>> result, List<Integer> subsequence){
        if(idx >= arr.length){
            result.add(new ArrayList<>(subsequence));
            return;
        }
        subsequence.add(arr[idx]);
        findSubsequences(arr, idx+1, result, subsequence);
        subsequence.remove(subsequence.size()-1);
        findSubsequences(arr, idx+1, result, subsequence);
    }

    public static void main(String[] args) {
	    int[] arr = {3,1,2};
	    List<List<Integer>> result = new ArrayList<>();
        findSubsequences(arr,0,result,new ArrayList<>());

        for(List<Integer> subsequence : result){
            for(int sub : subsequence){
                System.out.print(sub+" ");
            }
            System.out.println();
        }
	}

}