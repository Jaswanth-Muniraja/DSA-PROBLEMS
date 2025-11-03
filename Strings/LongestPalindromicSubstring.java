public class LongestPalindromicSubstring {

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        String res = "";
        for(int i=0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)){
                    if(sub.length() >= res.length() ) res = sub;
                }
            }
        }
        return res;
    }
    
    // public static String longestPalindromicSubstring(String s) {
    //     if (s == null || s.length() < 1) return "";
    //     int start = 0, end = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
    //         int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
    //         int len = Math.max(len1, len2);
    //         if (len > end - start) {
    //             start = i - (len - 1) / 2;
    //             end = i + len / 2;
    //         }
    //     }
    //     return s.substring(start, end + 1);
    // }

    // private static int expandAroundCenter(String s, int left, int right) {
    //     while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    //         left--;
    //         right++;
    //     }
    //     return right - left - 1; // Length of the palindrome
    // }
   
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println("The longest palindromic substring is: " + result);
    }

}