class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxC = 0;

        for(int n : nums){
            if(n == 1){
                count++;
                maxC = Math.max(maxC, count);
            }else{
                count = 0;
            }
        }
        return maxC;
    }
}