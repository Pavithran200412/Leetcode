class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int zcount = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == 0){
                    zcount++;
                }
                if(zcount > k){
                    break;
                }
                max_count =  Math.max(max_count, j - i + 1);
            }
        }
        return max_count;
    }
}