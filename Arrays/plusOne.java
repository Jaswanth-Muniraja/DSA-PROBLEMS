public class plusOne {

    public static int[] plus_one(int[] digits){
        int n = digits.length;
        for (int i = n-1; i >=0; i--) {
            if(digits[i]+1 != 10){
                digits[i] = digits[i]+1;
                return digits;
            }    
            digits[i] = 0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = {1,9,9,9,9};
        int[] result = plus_one(digits);
        for(int res : result){
            System.out.print(res+"");
        }        
    }
}
