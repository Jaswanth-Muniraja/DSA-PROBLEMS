import java.util.ArrayList;
import java.util.List;

class powerSet{

    public static void printPowerSet(int[] arr,  List<List<Integer>> result){
        int n = arr.length;
        int powerSetSize = (int)Math.pow(2, n); // Total subsets = 2^n
        for (int i = 0; i < powerSetSize; i++) {
            List<Integer> subsequence = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { // Check if jth bit is taken
                    subsequence.add(arr[j]);
                }
            }
            result.add(new ArrayList<>(subsequence));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        printPowerSet(arr, result);
        for (List<Integer> subset : result) {
            System.out.print(subset+" ");
        }
    }
    
}