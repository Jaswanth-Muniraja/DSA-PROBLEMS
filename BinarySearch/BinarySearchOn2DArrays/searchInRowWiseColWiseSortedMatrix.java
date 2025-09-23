public class searchInRowWiseColWiseSortedMatrix {

    public static boolean findTarget(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m-1;
        while(i < n && j >= 0){
            int ele = matrix[i][j];
            if(ele == target) return true;
            if(ele < target) i++;
            else j--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        // int target = 20; 
        boolean foundTarget = findTarget(matrix, target);

        if(foundTarget){
            System.out.println("Target is found");
        }else{
            System.out.println("Target Not found");
        }
    }
}