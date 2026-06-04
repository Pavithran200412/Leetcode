class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max_count = 0;
        int n = nums.length;
        int l = 0;
        int zcount = 0;
        // for(int i = 0; i < n; i++){
        //     int zcount = 0;
        //     for(int j = i; j < n; j++){
        //         if(nums[j] == 0){
        //             zcount++;
        //         }
        //         if(zcount > k){
        //             break;
        //         }
        //         max_count =  Math.max(max_count, j - i + 1);
        //     }
        // }

        // for(int r = 0; r < n; r++){
        //     if(nums[r] == 0){
        //         zcount++;
        //     }
        //     while(zcount > k){
        //         if(nums[l] == 0){
        //             zcount--;
        //         }
        //         l++;
        //     }
        //     max_count = Math.max(max_count, r - l + 1);
        // }
        // return max_count;

        for(int r = 0; r < n; r++){
            if(nums[r] == 0){
                zcount++;
            }
            if(zcount > k){
                if(nums[l] == 0){
                    zcount--;
                }
                l++;
            }
        }
        return n - l;
    }
}