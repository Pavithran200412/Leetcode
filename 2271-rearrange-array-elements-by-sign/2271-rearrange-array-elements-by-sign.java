class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pid = new ArrayList<>();
        ArrayList<Integer> nid = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pid.add(nums[i]);
            }else{
                nid.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length / 2; i++){
            nums[2 * i] = pid.get(i);
            nums[2*i + 1] = nid.get(i);
        }
        return nums;
    }
}