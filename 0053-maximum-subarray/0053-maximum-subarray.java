class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int sums = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for(int i = 0; i < nums.length; i++){
            if (sum == 0) start = i;

            sum += nums[i];

            if(sum > sums){
                sums = sum;

                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return sums;
    }
}