public class powerOfANumber { // without using inbuilt function

    public static double myPow(double x, int n) {
        if( n == 0) return 1.0;
        int m = n; // to store original value of n, and use it later to check if n was negative
        if(n<0) n = -n;
        double ans = 1.0;

        while(n > 0){
            if( n%2 == 1){ 
                n = n -1;
                ans *= x; // multiplying the base, because x^(n-1) * x = x^n
            }else{
                n = n/2;
                x = x*x; // squaring the base, because (x^2)^(n/2) = x^n
            }
        }

        if( m < 0) ans = 1.0/ans;
        return ans;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -3;
        double result = myPow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }

}