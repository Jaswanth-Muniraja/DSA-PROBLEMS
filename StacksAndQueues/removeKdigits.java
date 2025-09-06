import java.util.*;
public class removeKdigits {

    public static String remove_K_digits(String s, int k){
        Stack<Character> st = new Stack<>();
        if(k == s.length()) return "0";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        while(sb.length()>0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
    
    public static void main(String[] args) {
        String s = "1432219";
        // String s = "10200"; int k = 1; // Output: 200 
        int k = 3;
        String res = remove_K_digits(s,k);
        System.out.println(res);
    }
}
