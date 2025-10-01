public class checkPalindrome {

    public static boolean isPalindrome(String s, int idx){
        int n = s.length();
        if(idx >= n/2) return true;
        return s.charAt(idx) == s.charAt(n-idx-1);
    }

    public static void main(String[] args){
        String s = "MADAM";
        boolean isPalindrome = isPalindrome(s,0);
        if(isPalindrome){
            System.out.println("The given string is a Palindrome");
        }else{
            System.out.println("The given string is not a Palindrome");
        }
    }

}
