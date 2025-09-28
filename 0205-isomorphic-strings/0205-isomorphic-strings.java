class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sToT = new int[256];
        int[] tToS = new int[256];

        for (int i = 0; i < 256; i++) {
            sToT[i] = -1;
            tToS[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (sToT[c1] != -1 && sToT[c1] != c2) return false;
            if (tToS[c2] != -1 && tToS[c2] != c1) return false;

            // Add mapping
            sToT[c1] = c2;
            tToS[c2] = c1;
        }

        return true;
    }
}
