public class trappingRainWater {

    //  public static int trap(int[] height) {
    //     int n = height.length;
    //     int total = 0;
    //     // int[] prefixMax = prefixMaximum(height, n);
    //     int[] suffixMax = suffixMaximum(height, n);
    //     int leftMax = -1;
    //     for(int i=0; i<n; i++){
    //         leftMax = Math.max(leftMax, height[i]);
    //         // if(height[i]<prefixMax[i] && height[i]<suffixMax[i])
    //         //     total += Math.min(prefixMax[i],suffixMax[i])-height[i];
    //         if(height[i]<leftMax && height[i]<suffixMax[i]){
    //             total += Math.min(leftMax,suffixMax[i])-height[i];
    //         }
    //     }
    //     return total;
    // }

    // public static int[] suffixMaximum(int[] height, int n){
    //     int[] suf = new int[height.length];
    //     suf[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--){
    //         suf[i] = Math.max(height[i], suf[i+1]);
    //     }
    //     return suf;
    // }

    // // public static int[] prefixMaximum(int[] height, int n){
    // //     int[] pref = new int[height.length];
    // //     pref[0] = height[0];
    // //     for(int i=1; i<n; i++){
    // //         pref[i] = Math.max(height[i], pref[i-1]);
    // //     }
    // //     return pref;
    // // }


    // II Method
    public static int trap(int[] height) {
        int leftMax = 0, rightMax = 0, total = 0;
        int l = 0, r = height.length-1;
        while(l < r){
            if(height[l]<=height[r]){
                if(leftMax>height[l]){
                    total+= leftMax-height[l];
                }else{
                    leftMax = height[l];
                }
                l++;
            }else{
                if(rightMax>height[r]){
                    total+= rightMax-height[r];
                }else{
                    rightMax = height[r];
                }
                r--;
            }
        }
        return total;
    }
    
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
