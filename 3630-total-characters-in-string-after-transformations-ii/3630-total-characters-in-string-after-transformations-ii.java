class Solution {
    private static final int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t, List<Integer> numsList) {
        int[] nums = numsList.stream().mapToInt(i -> i).toArray();

        long[][] M = new long[26][26];
        for (int i = 0; i < 26; i++) {
            int count = nums[i];
            for (int j = 1; j <= count; j++) {
                M[i][(i + j) % 26] += 1;
            }
        }

        long[][] Mt = matrixPower(M, t);

        long[] V = new long[26];
        for (char c : s.toCharArray()) {
            V[c - 'a'] += 1;
        }

        long[] result = multiplyVectorMatrix(V, Mt);

        long total = 0;
        for (long val : result) {
            total = (total + val) % MOD;
        }

        return (int) total;
    }

    private long[][] matrixPower(long[][] M, int power) {
        int size = M.length;
        long[][] result = new long[size][size];

        for (int i = 0; i < size; i++) result[i][i] = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                result = multiplyMatrix(result, M);
            }
            M = multiplyMatrix(M, M);
            power >>= 1;
        }
        return result;
    }

    private long[][] multiplyMatrix(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;
                for (int j = 0; j < n; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    private long[] multiplyVectorMatrix(long[] V, long[][] M) {
        int n = V.length;
        long[] result = new long[n];
        for (int i = 0; i < n; i++) {
            if (V[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                result[j] = (result[j] + V[i] * M[i][j]) % MOD;
            }
        }
        return result;
    }
}
