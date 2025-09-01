import java.util.*;

public class octalToDecimal {

    public static int octal_to_decimal(int octal){
        int n = 0;
        int decimal = 0;
        while(octal > 0){
            int digit = octal%10;
            decimal += digit*Math.pow(8,n);
            octal = octal/10;
            n++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int octal = 125;
        int decimal = octal_to_decimal(octal);
        System.out.println(decimal);
    }
}
