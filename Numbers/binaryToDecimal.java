import java.util.*;

public class binaryToDecimal {

    public static int binary_to_decimal(int binary){
        int n = 0;
        int decimal = 0;
        while(binary > 0){
            int digit = binary%10;
            decimal += digit*Math.pow(2,n);
            binary = binary/10;
            n++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 1010101;
        int decimal = binary_to_decimal(binary);
        System.out.println(decimal);
    }
}
