import java.util.ArrayList;
import java.util.List;

public class primeFactorization {

    //  public static List<Integer> getPrimeFactorsOfNum(int num) {
    //     List<Integer> li = new ArrayList<>();
    //     for(int i=2; i <= num; i++){
    //         if(num%i == 0){
    //             li.add(i);
    //         }
    //         while(num%i == 0){
    //             num /= i;
    //         }
    //     }
    //     return li;
    // }

    public static List<Integer> getPrimeFactorsOfNum(int num) {
        List<Integer> li = new ArrayList<>();
        for(int i=2; i*i <= num; i++){
            if(num%i == 0){
                li.add(i);
            }
            while(num%i == 0){
                num /= i;
            }
        }
        if(num != 1) li.add(num);
        return li;
    }
    // Time complexity : sqrt(num)*log(num)

    public static void main(String[] args){
        // int num = 192; // 2 3
        int num = 345; // 3 5 23
        List<Integer> primeFactors = getPrimeFactorsOfNum(num);
        primeFactors.forEach((n) -> System.out.print(n + " "));
    }
}