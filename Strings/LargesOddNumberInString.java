public class LargesOddNumberInString {

    public static String findLargestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if ((digit - '0') % 2 != 0) { // Check if the digit is odd
                return num.substring(0, i + 1);
            }
        }
        return ""; // No odd digit found

        // II Method

        // int i=num.length()-1;
        // while(i>=0){
        //     char ch = num.charAt(i);
        //     if((ch-48)%2 != 0) return num.substring(0,i+1); 
        //     i--;
        // }
        // return "";
    }

    public static void main(String[] args){
        String num = "32709";
        String largestOdd = findLargestOddNumber(num);
        System.out.println("Largest odd number: " + largestOdd);
    }

}