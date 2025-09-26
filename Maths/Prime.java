public class Prime {

    public static boolean isPrime(int num){
        int count = 0;
        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                count++;
                if((num/i) != i)  count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args){
        int num = 73;
        if(isPrime(num)){
            System.out.println(num+" is a prime Number");
        }else{
            System.out.println(num+" is not a prime Number");
        }
    }
}
