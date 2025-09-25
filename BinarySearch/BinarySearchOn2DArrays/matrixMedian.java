// Given a row-wise sorted matrix mat[][] of size n*m, where the number of rows and columns is always odd. 
// Return the median of the matrix.

public class matrixMedian {

    private static int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m-1]);
        }

        int requiredELements = (n*m)/2; // since n and m are odd n*m also gives odd, n*m/2 gives No of elements before median
        while(low <= high){
            int mid = (low+high)/2;
            int smallEqualElements = CountSmallEqualEleAtMid(matrix, mid);
            if(smallEqualElements <= requiredELements) low = mid + 1; // The position where No of smallEqual elements before the ele is <= requiredELements 
            else high = mid - 1;                                          // and at the ele is > requiredELements is the median
        }
        return low;
    }
    public static int CountSmallEqualEleAtMid(int[][] matrix, int val) {
        int n = matrix.length;
        int m = matrix[0].length; 
        int countSmallEqual = 0;
        for(int i=0; i<n; i++){
            countSmallEqual += upperBound(matrix[i],val);
        }
        return countSmallEqual;
    }
    public static int upperBound(int[] arr, int val) {
        int n = arr.length;
        int ans = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > val){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[][] matrix = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}}; // 5
        int[][] matrix = {{2, 4, 9}, {3, 6, 7}, {4, 7, 10}}; // 6

        int median = findMedian(matrix);
        System.out.println("The median of the given Matrix is : "+ median);
    }

}