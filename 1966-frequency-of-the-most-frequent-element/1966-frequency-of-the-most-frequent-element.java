class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int n = 0, freq = 1;

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            while((long)nums[i]* (i - n + 1) - sum > k){
                sum = sum - nums[n];
                n++;
            }
            freq = Math.max(freq, i - n + 1);
        }
        return freq;
    }
}