class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == num)
                count++;
            }
            if(count == 1)
            return num;
        }
        return num;
    }
}