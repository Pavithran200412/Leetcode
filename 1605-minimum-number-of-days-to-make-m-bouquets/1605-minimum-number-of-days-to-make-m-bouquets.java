class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1; // Not enough flowers

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                right = mid; // try smaller days
            } else {
                left = mid + 1; // need more days
            }
        }
        return left;
    }

    // Check if we can make at least m bouquets by day 'day'
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // reset when a flower hasn't bloomed
            }
            if (bouquets >= m) return true;
        }
        return false;
    }
}
