public class ReverseWordsInString {
    
    public static String reverseWords(String s) {

        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  Hello   World  "; // output: "World Hello" // no leading or trailing spaces
        // String s = "a good   example"; // output: "example good a" // no leading or trailing spaces, and only one space between words
        String result = reverseWords(s);
        System.out.println("Reversed words: '" + result + "'");
    }

}