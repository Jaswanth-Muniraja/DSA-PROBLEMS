import java.util.Stack;

public class nextGreaterElement{

    public static int[] next_Greater_Element(int[] num) {
        int n = num.length;
        int[] nge = new int[num.length];
        Stack<Integer> st = new Stack<>();
        for(int i =n-1; i>=0; i--){
            while(!st.isEmpty() && num[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge[i] = -1;
                }else{
                    nge[i] = st.peek();
                }
                st.push(num[i]);
        }
        return nge;
    }

    // If array is a circular array, where last index of array is pointing to first index of array
    public static int[] next_Greater_Elements(int[] num) {
        int n = num.length;
        int[] nge = new int[num.length];
        Stack<Integer> st = new Stack<>();
        for(int i =2*n-1; i>=0; i--){
            int idx = i%n;
            if(i>=n){
                while(!st.isEmpty() && num[idx]>=st.peek()){
                    st.pop();
                }
                st.push(num[idx]);
            }else{
                while(!st.isEmpty() && num[idx]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    nge[idx] = -1;
                }else{
                    nge[idx] = st.peek();
                }
                st.push(num[idx]);
            }
        }
        return nge;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int[] nge = next_Greater_Element(arr);
        int[] nges = next_Greater_Elements(arr);
        for(int n : nge){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n : nges){
            System.out.print(n+" ");
        }
    }
}