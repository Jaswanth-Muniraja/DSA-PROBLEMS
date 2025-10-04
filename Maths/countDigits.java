public class countDigits {

    public static int countNumberOfDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args){
        int num = 12345;
        int digits = countNumberOfDigits(num);
        System.out.println("The total number of digits in the given number = " + digits);
    }
    
}
