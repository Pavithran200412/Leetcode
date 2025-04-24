class Solution {
    public boolean isHappy(int n) {
        int current = n;
        while (current != 1) {
            int div = current, sum = 0;
            while (div > 0) {
                sum += (int) Math.pow(div % 10, 2);
                div /= 10;
            }
            if (sum == 4) return false;
            current = sum;
        }
        return true;
    }
}