import java.util.*;
class largestAreaOfRectangleInHistogram{

    public static int largest_Area_Of_Rectangle(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int area = 0;
        int maxArea = 0;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int idx = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                area = heights[idx] * (i-(pse)-1);
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            area = heights[idx] * (n-(pse)-1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    // II Method
    // public int largest_Area_Of_Rectangle(int[] heights) {
    //     int[] nse = nextSmallerEle(heights);
    //     int[] pse = previousSmallerEle(heights);
    //     int max = -1;
    //     for(int i=0; i<heights.length; i++){
    //         int area = heights[i]*(nse[i]-pse[i]-1);
    //         max = Math.max(max,area);
    //     }
    //     return max;
    // }

    // public int[] nextSmallerEle(int[] arr){
    //     Stack<Integer> st = new Stack<>();
    //     int[] nse = new int[arr.length];
    //     for(int i=arr.length-1; i>=0; i--){
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
    //             st.pop();
    //         }
    //         nse[i] = st.isEmpty() ? arr.length : st.peek();
    //         st.push(i); 
    //     }
    //     return nse;
    // }

    // public int[] previousSmallerEle(int[] arr){
    //     Stack<Integer> st = new Stack<>();
    //     int[] pse = new int[arr.length];
    //     for(int i=0; i<arr.length; i++){
    //         while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
    //             st.pop();
    //         }
    //         pse[i] = st.isEmpty() ? -1 : st.peek();
    //         st.push(i); 
    //     }
    //     return pse;
    // }

    public static void main(String[] args) {
        // int[] arr ={2,1,5,6,2,3};
        int[] arr ={3,3,3};
        int maxArea = largest_Area_Of_Rectangle(arr);
        System.out.println(maxArea);
    }
}