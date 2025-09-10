import java.util.HashMap;

public class FruitsIntoBasket {

    public static int totalFruits(int[] fruits){
        int n = fruits.length;
        int l =0, r = 0, maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<n){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);
            while(map.size() > 2){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            maxLen = Math.max(maxLen, (r-l+1));
            r++;
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int[] fruits = {1,2,2,3,4,2,3,4,4,3,2,2};
        int total = totalFruits(fruits);
        System.out.println(total);
    }
}
