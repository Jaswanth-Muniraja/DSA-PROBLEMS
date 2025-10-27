public class sieveOfEratosthenes {
    
    public static void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i] = true;
        }

        for(int i=2;i*i<=n;i++){ // i*i to avoid redundant calculations
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){ // Marking all multiples of i as non-prime
                    isPrime[j] = false;
                }
            }
        } // Nlog(log(N))

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println("Prime numbers up to "+n+" are :");
        sieve(n);
    }

}