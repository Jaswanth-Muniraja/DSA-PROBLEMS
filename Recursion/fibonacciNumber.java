public class fibonacciNumber {

    public static int findFactorial(int N){
        if(N <= 1) return N;
        return findFactorial(N-1) + findFactorial(N-2);
    }

    public static void main(String[] args) {
        int N = 6; // 0 1 1 2 3 5 8 (0 based indexing)
        int factorialOfN = findFactorial(N);
        System.out.println("The Fibonacci series up to "+N+"th term is : "+ factorialOfN);

    }

}
