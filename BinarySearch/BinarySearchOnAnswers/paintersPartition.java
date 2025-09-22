// Same problem as bookAllocationProblem and Split array - Largest Sum

public class paintersPartition {

    public static int findMaxMinWork(int[] work, int painters){
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int w : work){
            low = Math.max(low, w);
            high += w;
        }
        while(low <= high){
            int mid = (low + high)/2;
            int NoOfPainters = paintersPossibleWithWorkAsMid(work, mid);
            if( NoOfPainters > painters){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
    public static int paintersPossibleWithWorkAsMid(int[] work, int assumedWork){
        int n = work.length;
        int noOfPainters = 1;
        int workDone = 0;
        for(int i=0; i<n; i++){
            if( workDone+work[i] <= assumedWork){
                workDone += work[i];
            }else{
                noOfPainters++;
                workDone = work[i];

            }
        }
        return noOfPainters;
    }

    public static void main(String[] args){
        int[] work = {12, 34, 67, 90};
        int painters = 2;
        int maxMinWork = findMaxMinWork(work, painters);
        System.out.println(maxMinWork); 
    }
}