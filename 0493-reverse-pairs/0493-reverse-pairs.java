class Solution {
    int count;
    public int reversePairs(int[] nums) {
        count = 0;
        mergesort(nums,0,nums.length-1);
        return count;
    }
    public void mergesort(int[] nums, int si, int ei){
        if(si>=ei)return;
        int mid = si + (ei - si)/2;

        mergesort(nums,si,mid);
        mergesort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }

    public void merge(int[]nums, int si, int mid, int ei){
        int right = mid+1;

        for(int left = si; left<=mid; left++){
            while(right<=ei && (long)nums[left] > 2L * nums[right])right++;
            
            count += right - (mid+1);
                
            
        }

        int[] temp = new int[ei-si+1];
        int k = 0;
        int i = si;
        int j = mid+1;

        while(i<=mid && j<=ei){
            if(nums[i]>nums[j]){
                temp[k] = nums[j];
                j++;
            }else{
                temp[k] = nums[i];
                i++;
            }
            k++;
        }

        while(j<=ei){
            temp[k++] = nums[j++];
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }

        for(k = 0,i = si; k<temp.length; k++,i++){
            nums[i] = temp[k];
        }
    }
}