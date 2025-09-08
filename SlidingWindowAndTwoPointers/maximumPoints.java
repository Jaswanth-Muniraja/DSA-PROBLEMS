package SlidingWindowAndTwoPointers;
class maximumPoints {
    public static int max_points_obtained(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0, rightSum = 0, maxSum = 0;
        for(int i=0; i<=k-1; i++){
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;
        int right = n-1;
        for (int i = k-1; i >=0 ; i--) {
            leftSum -= cardPoints[i];

            rightSum += cardPoints[right];
            right--;

            maxSum = Math.max(maxSum, leftSum+rightSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        int k = 3;
        int res = max_points_obtained(arr, k);
        System.out.println(res);
    }
}
