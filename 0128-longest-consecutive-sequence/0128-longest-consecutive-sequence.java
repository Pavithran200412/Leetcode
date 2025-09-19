class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums == null || nums.length == 0) return 0;
        int longest = 1;
        int count = 0;
        int last_small = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
           if(nums[i] - 1 == last_small){
            count = count + 1;
            last_small = nums[i];
        }else if(nums[i] != last_small){
            count = 1;
            last_small = nums[i];
        }
        longest = Math.max(longest, count); 
    }
    return longest;
    }
}