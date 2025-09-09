package SlidingWindowAndTwoPointers;

import java.util.Arrays;

public class NoOfSubstringsContainingAllThreeCharacters {
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        // Brute
        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     int[] hash = new int[3];
        //     for(int j=i; j<n; j++){
        //         hash[s.charAt(j) - 'a'] = 1;
        //         if(hash[0]+hash[1]+hash[2] == 3){
        //             sum += (n-j);                // -> -> abc_a_a (n-j) subarrays
        //             break;
        //         }
        //     }
        // }
        // return sum;

        // Optimal
        int sum = 0;
        int[] lastSeen = new int[3];
        Arrays.fill(lastSeen, -1);
        for(int i=0; i<n; i++){
            lastSeen[s.charAt(i)-'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                int min = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
                sum+= min+1;                  //  <- <- a_a_abc (min+1) subarrays 
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "aaabcaa";
        int res = numberOfSubstrings(s);
        System.out.println(res); // 11
    }
}
