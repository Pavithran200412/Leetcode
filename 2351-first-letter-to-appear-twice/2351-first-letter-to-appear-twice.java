class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> mpp = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(mpp.contains(ch)){
                return ch;
            }
            mpp.add(ch);
        }
        return ' ';
    }
}