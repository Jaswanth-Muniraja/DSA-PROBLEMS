public class searchIn2DArray {

     public static boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix.length;
      int m = matrix[0].length;
      int low = 0;
      int high = (n*m) - 1;
      while(low <= high){
        int mid = (low + high)/2;
        int row = mid/m;         // Because Every staring index of the row is multiple of 'm'. So, divide by 'm' gives correct row position. 
        int col = mid%m;         // Similarly. % of 'm' gives the correct column position. Since every starting index is multiple of 'm'.
        if(matrix[row][col] == target) return true;
        else if(target > matrix[row][col]) low = mid+1;
        else high = mid -1;
      }
      return false;
    }

     public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;
        if(searchMatrix(matrix, target)){
            System.out.println("Target is Present in the matrix");
        }else{
            System.out.println("Target is Not Present in the matrix");
        }
     }
}
