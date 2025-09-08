package SlidingWindowAndTwoPointers;

import java.util.*;

public class longestSubstringWithoutRepeating {

    public static int longest_Substring_Without_Repeating(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while(r<n){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            maxLen= Math.max(maxLen, r-l+1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
    
    // II Method
    //  public static int longest_Substring_Without_Repeating(String s) {
    //     int n = s.length();
    //     int l = 0;
    //     int r = 0;
    //     int maxLen = 0;
    //     Set<Character> set = new HashSet<>();
    //     while(r<n){
    //         while(set.contains(s.charAt(r))){
    //             set.remove(s.charAt(l));
    //             l++;
    //         }
    //         maxLen= Math.max(maxLen, r-l+1);
    //         set.add(s.charAt(r));
    //         r++;
    //     }
    //     return maxLen;
    // }

    public static void main(String[] args) {
        String s = "cabdezacab";
        int res = longest_Substring_Without_Repeating(s);
        System.out.println(res);
    }
}
