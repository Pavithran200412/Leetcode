class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i ++) {
            for (int j = i; j < nums.length; j ++) {
                int total = nums[j] + nums[j - i];
                if(target == total){
                    return new int[]{j - i , j};
                }
            }
        }
        return new int[]{};
    }
}