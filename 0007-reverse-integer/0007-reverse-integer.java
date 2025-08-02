class Solution {
    public int reverse(int x) {
        int sign;
        if(x < 0){
            sign = -1;
        }else{
            sign = 1;
        }

        x = Math.abs(x); 
        long rev = 0;
        
        while(x > 0){
            int ld = x % 10;
                rev = (rev * 10) + ld;
                x = x / 10;
        }
        rev =  sign * rev;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}