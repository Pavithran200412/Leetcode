class Solution {
    public int maxSubArray(int[] nums) {
        // int sum = 0;
        // int sums = Integer.MIN_VALUE;

        // int start = 0;
        // int ansStart = -1, ansEnd = -1;

        // for(int i = 0; i < nums.length; i++){
        //     if (sum == 0) start = i;

        //     sum += nums[i];

        //     if(sum > sums){
        //         sums = sum;

        //         ansStart = start;
        //         ansEnd = i;
        //     }
        //     if(sum < 0){
        //         sum = 0;
        //     }
        // }
        // return sums;

        // int currentSum = nums[0]; 
        // int maxSum = nums[0];   

        // for (int i = 1; i < nums.length; i++) {
        //     currentSum = Math.max(nums[i], currentSum + nums[i]);
        //     maxSum = Math.max(maxSum, currentSum);
        // }
        // return maxSum;

        int sum = 0;
        int sums = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > sums){
                sums = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return sums;
    }
}