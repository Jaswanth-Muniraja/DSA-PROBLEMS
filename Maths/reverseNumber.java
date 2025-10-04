public class reverseNumber {

    public static int reverseTheNumber(int num){
        int reverse = 0;
        while(num > 0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num/=10;
        }
        return reverse;
    }

    public static void main(String[] args){
        int num = 12345;
        int reversedNumber = reverseTheNumber(num);
        System.out.println("The reverse of the given number is : " + reversedNumber);
    }

}
