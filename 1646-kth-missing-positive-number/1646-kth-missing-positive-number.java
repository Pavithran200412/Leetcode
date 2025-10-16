class Solution {
    public int findKthPositive(int[] arr, int k) {
        int current = 1, index = 0;
        
        while (k > 0) {
            if (index < arr.length && arr[index] == current) {
                index++; 
            } else {
                k--; 
                if (k == 0) return current;
            }
            current++;
        }
        return current;
    }
}
