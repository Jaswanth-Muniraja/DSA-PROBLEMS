public class MaximumNestingDepthOfParentheses {

    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
            }
            else if(ch == ')'){
                count--;
            }
            max = Math.max(count,max);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1"; // Here, the maximum nesting depth is 3, As 8 lies inside 3 parentheses.(((8)/4))
        int result = maxDepth(s);
        System.out.println("Maximum Nesting Depth: " + result);
    }

}