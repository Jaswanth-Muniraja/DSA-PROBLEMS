package BinarySearchOnAnswers;

// This is only to find floor value of the sqrt of a number
public class sqrtOfaNumber {

    public static int sqrt(int num){
        int low = 1;
        int high = 29;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if( (mid*mid) <= num){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        // return high; //opposite polarity, from being a possible answer to not answer, not answer to answer
        return ans;
    }

    public static void main(String[] args){
        int num = 28;
        int sqrt = sqrt(num);
        System.out.println(sqrt);
    }
}
