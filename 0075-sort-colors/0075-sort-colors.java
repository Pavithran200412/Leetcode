class Solution {
    public void sortColors(int[] nums) {
        int pass, i, temp;
    for(pass = nums.length -1; pass >= 0; pass--){
        for(i = 0; i <= pass - 1; i++){
            if(nums[i] > nums[i + 1]){
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                }
            }
        }
    }
}