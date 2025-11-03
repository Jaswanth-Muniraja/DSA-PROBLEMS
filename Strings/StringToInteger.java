public class StringToInteger {
    
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        // Define integer limits, if the result exceeds these limits, we return the limit values
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        
        int i = 0;
        int n = s.length();
        
        while (i < n && s.charAt(i) == ' ') { // Skip leading whitespaces
            i++;
        }
        
        if (i == n) {
            return 0;
        }
        
        int sign = 1; // Default sign is positive
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }
            
            i++;
        }
        
        return (int)(res * sign);        
    }

    public static void main(String[] args) {
        String str = "  -1337c0d3"; // output: -1337
        int result = myAtoi(str);
        System.out.println("The converted integer is: " + result);
    }

}