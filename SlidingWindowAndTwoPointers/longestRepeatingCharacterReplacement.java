
public class longestRepeatingCharacterReplacement {
     public static int characterReplacement(String s, int k) {
        int n = s.length();
        int r = 0;
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] hash = new int[26];
        while(r<n){
            hash[s.charAt(r) - 'A'] +=1;
            maxFreq = Math.max(maxFreq,  hash[s.charAt(r) - 'A']);
            while((r-l+1)-maxFreq > k){
                hash[s.charAt(l)- 'A'] -= 1;
                // for(int i=0; i<26; i++) maxFreq = Math.max(maxFreq, hash[i]); 
                // No need of updating and making maxFreq small,
                // it is useless as you need greater length than found maxFreq should be more than small
                l++;
            }
            if((r-l+1)-maxFreq <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args){
        String s = "ABAABABBB";
        int k = 2;
        int res = characterReplacement(s, k);
        System.out.println(res);
    }
}
