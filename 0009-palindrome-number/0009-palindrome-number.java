class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int pd = 0;
        while(x > 0){
            int ld = x % 10;
            pd = (pd * 10) + ld;
            x = x / 10;
        }
        if(temp == pd){
            return true;
        }else{
            return false;
        } 
    }
}