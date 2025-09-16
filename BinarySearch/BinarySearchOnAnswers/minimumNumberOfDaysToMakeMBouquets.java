package BinarySearchOnAnswers;

public class minimumNumberOfDaysToMakeMBouquets {

    public static int minDays(int[] bloomDay, int m, int k){
        if(bloomDay.length < m*k) return -1; // cannot make m bouquets with k adjacent flowers
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int bloom : bloomDay){
            low = Math.min(bloom, low);
            high = Math.max(bloom, high);
        }
        while( low <= high){
            int mid = (low+high)/2;
            if(isPossibleToMakeMBouquets(bloomDay, mid, m, k)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean isPossibleToMakeMBouquets(int[] bloomDay, int day, int m , int k){
        int count  =0;
        int bouquetsMade = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }else{
                bouquetsMade +=  count/k;
                count = 0;
            }
        }
        bouquetsMade += count/k;
        return bouquetsMade >= m;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int minDays = minDays(bloomDay,m,k);
        System.out.println(minDays); // 3
    }
}
