class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() -1;
        while(start < end){
            char l = s.charAt(start), r = s.charAt(end);
            if(!Character.isLetterOrDigit(l)){
                start++;
            }else if(!Character.isLetterOrDigit(r)){
                end--;
            }else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }else{
            start++;
            end--;
            }
        }
        return true;
    }
}