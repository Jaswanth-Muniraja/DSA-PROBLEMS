public class divideTwoNumbers { // Without using multiplication, division and mod operator

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) { // Overflow case
            return Integer.MAX_VALUE;
        }

        if (dividend == divisor) return 1;

        boolean sign = true;
        if(dividend >= 0 && divisor < 0) sign = false;
        if(dividend < 0 && divisor > 0) sign = false;

        long nume = Math.abs((long) dividend);
        long deno = Math.abs((long) divisor);
        long ans = 0;

        while (nume >= deno) {
            int cnt = 0;
            while (nume >= (deno << (cnt + 1))) cnt++; // << is equivalent to multiplying by 2 power
            nume -= deno << cnt;
            ans += 1L << cnt;
        }

        return sign ? (int) ans : (int) -ans;
    }

    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;
        int result = divide(dividend, divisor);
        System.out.println("The result of division is: " + result);
    }

}