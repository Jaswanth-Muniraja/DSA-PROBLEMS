package BinarySearchOnAnswers;

public class NthRootOfaNumber {

     public static int nthRoot(int num, int power){
        int low = 1;
        int high = 29;
        while(low <= high){
            int mid = (low + high)/2;
            if(pow(mid,power) == num) return mid;
            if(pow(mid,power) <= num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static int pow(int num, int power){
        return (int)Math.pow(num,power);
    }

    public static void main(String[] args){
        int num = 27;
        int power = 3; // 3 -> 3^3 = 27
        // int num = 64;
        // int power = 2; // 8 -> 8^2 = 64
        int nthRoot = nthRoot(num, power);
        System.out.println(nthRoot);
    }
}
