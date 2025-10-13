import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {
    
    public static List<List<String>> palindromePartitions(String s){
        List<List<String>> ans = new ArrayList<>();
        findPalindromePartitions(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public static void findPalindromePartitions(String s, int index, List<String> li, List<List<String>> ans){
        if(index >= s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if(isPalindrome(s,index,i)){
                li.add(s.substring(index, i+1));
                findPalindromePartitions(s, i+1, li, ans);
                li.remove(li.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start) !=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "aabb";  // [ [a, a, b, b] [a, a, bb] [aa, b, b] [aa, bb] ]
        List<List<String>> partitions = palindromePartitions(s);
        System.out.print("[ ");
        for(List<String> partition : partitions){
            System.out.print(partition+" ");
        }
        System.out.print("]");
    }

}
