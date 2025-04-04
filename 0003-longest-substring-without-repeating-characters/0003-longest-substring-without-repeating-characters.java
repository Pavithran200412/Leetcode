class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128];
        int maxLength = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            start = Math.max(start, charIndex[current]);
            charIndex[current] = i + 1;           
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}