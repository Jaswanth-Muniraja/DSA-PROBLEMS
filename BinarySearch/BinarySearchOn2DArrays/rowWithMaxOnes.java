// Each row of the array is sorted in non-decreasing order (only 0's and 1's).
// find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.

public class rowWithMaxOnes {

    public static int findRowIndexWithMaxOnes(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int maxOnesFound = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            int NoOfOnesInRow = m - lowerBound(matrix[i], 1);
            if( NoOfOnesInRow > maxOnesFound){
                maxOnesFound = NoOfOnesInRow;
                index = i;
            }
        }
        return index;
    }
    public static int lowerBound(int[] row, int target){
        int n = row.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(row[mid] >= target){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] matrix = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}}; // 2
        // int[][] matrix = {{0,1,1,1}, {0,1,1,1}, {0,1,1,1}, {0,0,0,0}}; // 1
        // int[][] matrix = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}}; // -1 
        int rowIndex = findRowIndexWithMaxOnes(matrix);
        System.out.println(rowIndex);
    }
}
