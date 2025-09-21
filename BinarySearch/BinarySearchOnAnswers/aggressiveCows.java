import java.util.Arrays;

// You are given an array with unique elements of stalls[], which denote the positions of stalls.
// You are also given an integer k which denotes the number of aggressive cows.
// The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

public class aggressiveCows {

    public static int findMaxDistanceToPlaceAllCows(int[] cowStalls, int cows){
        int n = cowStalls.length;
        Arrays.sort(cowStalls);
        int low = 1;
        int high = cowStalls[n-1] - cowStalls[0];
        while(low <= high){
            int mid = (low+high)/2;
            if(isPossibleToPlaceAllCowsWithDistance(cowStalls, mid, cows)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    public static boolean isPossibleToPlaceAllCowsWithDistance(int[] cowStalls, int Distance, int cows){
        int n = cowStalls.length;
        int cowsPlaced = 1;
        int currentStallCowPlaced = cowStalls[0];
        for(int i =1; i<n; i++){
            if( (cowStalls[i] - currentStallCowPlaced) >= Distance){
                cowsPlaced++;
                currentStallCowPlaced = cowStalls[i];
            }
        }
        return cowsPlaced >= cows;
    }

    public static void main(String[] args){
        int[] cowStalls = {10, 1, 2, 7, 5};
        int cows = 3;
        int maxDistance = findMaxDistanceToPlaceAllCows(cowStalls, cows);
        System.out.println(maxDistance);
    }
}
