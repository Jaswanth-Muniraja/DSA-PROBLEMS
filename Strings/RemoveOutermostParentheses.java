import java.util.Stack;

class RemoveOutermostParentheses{

    public static String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }

    // Using Stack
    // public static String removeOuterParenthesesUsingStack(String s) {
    //     StringBuilder result = new StringBuilder();
    //     Stack<Character> stack = new Stack<>();
    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //             if (!stack.isEmpty()) {
    //                 result.append(c);
    //             }
    //             stack.push(c);
    //         } else if (c == ')') {
    //             stack.pop();
    //             if (!stack.isEmpty()) {
    //                 result.append(c);
    //             }
    //         }
    //     }

    //     return result.toString();
    // }

    public static void main(String[] args){
        String s = "(()())(())"; // output: "()()()" // "(()())(())" -> for (()()) -> ()() + for (()) -> ()
        // String s = "(()())(())(()(()))"; // output: "()()()()(())" -> "(()())" -> "()()" + "(())" -> "()" + "(()(()))" -> "()(())"
        System.out.println(removeOuterParentheses(s));
    }
}