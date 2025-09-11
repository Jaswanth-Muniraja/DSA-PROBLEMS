public class minimumWindowSubString {
    public static String minimumString(String s, String t){
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        int[] hash = new int[256];
        int l = 0, r = 0, count = 0;
        int startIndex = -1, minLen = Integer.MAX_VALUE;
        for(int i=0; i<m; i++) hash[t.charAt(i)]++;
        while(r<n){
            if(hash[s.charAt(r)] > 0) count++;
            hash[s.charAt(r)]--;
            while(count == m){
                if((r-l+1) < minLen){
                    minLen = (r-l+1);
                    startIndex = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--;
                l++;
            }
            r++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex, startIndex+minLen);
    }
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        // find the minimum substring which has all String 't' characters in it, if not return an empty string
        String minString = minimumString(s,t);
        System.out.println(minString); //BANC
    }
}
