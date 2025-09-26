import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class factorsOfaNumber {

    public static List<Integer> getFactors(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                list.add(i);
                if((num/i) != i) list.add(num/i);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int num = 36;
        List<Integer> factorsOfNum =  getFactors(num);
        Collections.sort(factorsOfNum);
        factorsOfNum.forEach((item) -> System.out.print(item+" "));
    }

}