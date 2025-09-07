import java.util.Stack;

public class maximalRectangle {

    public static int maximal_rectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] mat = calcHeight(matrix);
        int maxArea = 0;
        for(int i=0; i<n; i++){
            maxArea  = Math.max(maxArea, maxArea(mat[i]));
        }
        return maxArea;
    }

    public static int[][] calcHeight(char[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] mat = new int[n][m];
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j =0; j<n; j++){
                if(matrix[j][i] - '0' == 0){
                    sum = 0;
                }else
                    sum += matrix[j][i] - '0';
                
                mat[j][i] = sum;
            }
        }
        return mat;
    }

    public static int maxArea(int[] height){
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int area;
        int maxArea = 0;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                int idx = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                area = height[idx] * (i - (pse) -1);
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            area = height[idx] * (n - (pse) -1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                            {'1','0','1','0','0'},
                            {'1','0','1','1','1'},
                            {'1','1','1','1','1'},
                            {'1','0','0','1','0'}
                        };
        int maxRectangle = maximal_rectangle(matrix);
        System.out.println(maxRectangle);
    }
}
