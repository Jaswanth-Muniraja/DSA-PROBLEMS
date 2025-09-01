import java.util.*;

public class decimalToHexadecimal{

    public static void decimal_to_octal(int decimal){
        char[] hexadecimal = new char[32];
        int i = 0;
        while(decimal>0)
        {
            int reminder = decimal % 16;
            if(reminder < 10){
                hexadecimal[i++] = (char) (reminder+48);
            }else{
                hexadecimal[i++] = (char) (reminder+55);
            }
            decimal = decimal / 16;
        }
        for(int j = i-1; j>=0; j--){
            System.out.print(hexadecimal[j]);
        }
    }

    // II Method
    // public static void decimal_to_octal(int decimal){
    //     Map<Integer,Character> hm = new HashMap<>();
    //     hm.put(10,'A');
    //     hm.put(11,'B');
    //     hm.put(12,'C');
    //     hm.put(13,'D');
    //     hm.put(14,'E');
    //     hm.put(15,'F');

    //     StringBuilder hexadecimal = new StringBuilder();
    //     while(decimal>0)
    //     {
    //         int reminder = decimal % 16;
    //         if(reminder > 9){
    //             char c = hm.get(reminder);
    //             hexadecimal.append(c);
    //         }else{
    //             hexadecimal.append(reminder);
    //         }
    //         decimal = decimal / 16;
    //     }
    //     System.out.println(hexadecimal.reverse());
    // }

    public static void main(String[] args) {
        int decimal = 51966;
        decimal_to_octal(decimal);
    }
}