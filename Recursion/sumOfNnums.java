public class sumOfNnums {

    public static int findSum(int N){
        if( N == 0) return 0;
        return N + findSum(N-1);
    }

    public static void main(String[] args){
        int N = 10;
        int sum = findSum(N); // Sum of first N natural numbers
        System.out.println(sum); 
    }

}
