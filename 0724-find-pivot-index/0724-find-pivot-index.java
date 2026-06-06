class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int lsum = 0;
            for(int j = 0; j < i; j++){
                lsum += nums[j];
            }
            int rsum = 0;
            for(int k = i + 1; k < n; k++){
                rsum += nums[k];
            }
            if(lsum == rsum){
                return i;
            }
        }
        return -1;
    }
}