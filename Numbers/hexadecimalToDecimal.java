import java.util.*;

public class hexadecimalToDecimal {

    static String digits = "0123456789ABCDEF";

    public static int hexaDecimal_to_decimal(String hexaDecimal){
        int n = 0;
        int decimal = 0;
        for(int i = hexaDecimal.length()-1; i>=0; i--){
            char c = hexaDecimal.charAt(i);
            int digit = digits.indexOf(c); 
            decimal += digit*Math.pow(16,n);
            n++;
        }
        return decimal;
    }

    // II Method
    // public static int hexaDecimal_to_decimal(String hexaDecimal){
    //     int decimal = 0;  
    //     for (int i = 0; i < hexaDecimal.length(); i++)  
    //     {  
    //         char c = hexaDecimal.charAt(i);  
    //         int d = digits.indexOf(c);  
    //         decimal = 16*decimal + d;  
    //     }  
    //     return decimal;  
    // }  

    public static void main(String[] args) {
        String hexaDecimal = "CAFE";
        int decimal = hexaDecimal_to_decimal(hexaDecimal.toUpperCase());
        System.out.println(decimal);
    }
}
