package BinarySearchOnAnswers;

// Find the minimum piles koko can eat per hour so that she can complete all the piles
// Remember If koko completes eating in 0.5 hours, she has to wait remaining 0.5 hours to move to next pile,
//  if kook completes in 2.1 hours, koko has to wait overall 3 hours. That is up to a ceil value of a hour

public class kokoEatingBananas {

    public static  int findMinToEatPerHour(int[] piles, int hour){
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(canKokoEatInTime(piles, mid, hour)){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean  canKokoEatInTime(int[] piles, int minPerHour, int hour){
        int time = 0;
        for(int pile : piles){
            time += (pile+minPerHour - 1) / minPerHour;
        }
        return time<=hour;
    }

    public static void main(String[] args){
        int piles[] = {3,6,7,11};
        int hour = 8; // deadline
        int minToEatPerHour = findMinToEatPerHour(piles,hour);
        System.out.println(minToEatPerHour);
    }
}
