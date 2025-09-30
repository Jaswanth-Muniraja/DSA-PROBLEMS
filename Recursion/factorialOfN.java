public class factorialOfN {

    public static int findFactorial(int N){
        if( N <= 1) return 1;
        return N * findFactorial(N-1);
    }

    public static void main(String[] args){
        int N = 7;
        int factorial = findFactorial(N); // Factorial of N
        System.out.println(factorial); 
    }

}
