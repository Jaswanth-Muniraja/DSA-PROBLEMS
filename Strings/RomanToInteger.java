import java.util.HashMap;

public class RomanToInteger {
    
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int Integer = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int val = hm.get(ch);
            if(i <s.length()-1 && val < hm.get(s.charAt(i+1))) Integer -= val;
            else Integer += val;
        }
        return Integer;
    }

    public static void main(String[] args) {
        //  I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
        // 1. If a smaller numeral appears before a larger one, it is subtracted.
        // 2. If a larger numeral appears before a smaller one, it is added.

        String s = "MCMXCIV"; // 1994 -> M(1000) + CM(900) -> (1000-100) + XC(90) -> (100-10) + IV(4) -> (5-1)
                              //  1000 + 900 + 90 + 4 = 1994 // or -> 1000 - 100 + 1000 - 10 + 100 - 1 + 5 = 1994
        int result = romanToInt(s);
        System.out.println("Integer value: " + result);
    }
        
}