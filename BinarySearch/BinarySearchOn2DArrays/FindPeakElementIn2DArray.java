// A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.
// Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].
// You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

public class FindPeakElementIn2DArray {

    public static int[] findPeakElement(int[][] matrix) {
        int m = matrix[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = (low+high)/2;
            int idx = findMaxElementIndex(matrix, mid); //max Element's Row Index In a Column
            int left = mid-1 >= 0 ? matrix[idx][mid-1] : -1; // we should assume a out of border element as -1
            int right = mid+1 < m ? matrix[idx][mid+1] : -1;
            if(left < matrix[idx][mid] && right < matrix[idx][mid]) return new int[] {idx,mid};
            if(left > matrix[idx][mid] ) high = mid -1;
            else low = mid + 1;
        }
        return new int[]{-1,-1};
    }
    public  static int findMaxElementIndex(int[][] matrix, int col) {
        int n = matrix.length;
        int index = -1;
        int maxEle = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int ele = matrix[i][col];
            if(ele > maxEle){
                index = i;
                maxEle = ele;
            }
        }
        return index;
    }

    public static void main (String[] args){
        int[][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
        int[] coordinatesOfPeakElement = findPeakElement(matrix);
        if(coordinatesOfPeakElement[0] == -1){
            System.out.println("No peak element found");
        }else{
            System.out.println("The coordinates of peak element is: "+ coordinatesOfPeakElement[0] +" "+coordinatesOfPeakElement[1]);
        }
    }
}