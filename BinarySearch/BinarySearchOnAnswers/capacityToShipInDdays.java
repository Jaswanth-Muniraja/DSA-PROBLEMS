// Find the minimum Capacity weight needed for a ship To ship given packages with weights within D days

public class capacityToShipInDdays {

    public static int findMinCapacity(int[] weights, int days){
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int weight :weights){
            low = Math.max(weight, low);
            high += weight;
        }
        while( low <= high){
            int mid = (low+high)/2;
            if(isPossibleToShip(weights, mid, days)){
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
    public static boolean isPossibleToShip(int[] weights, int capacity, int days){
        int requiredDays = 1;
        int shippedWeights = 0;
        for(int i=0; i<weights.length; i++){
            if(shippedWeights + weights[i] <= capacity){
                shippedWeights += weights[i];
            }else{
                requiredDays++;
                shippedWeights = weights[i];
            }
        }
        return requiredDays<=days;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int minCapacity = findMinCapacity(weights,days);
        System.out.println("Minimum capacity ship required : "+minCapacity); // 15
    }    
}
