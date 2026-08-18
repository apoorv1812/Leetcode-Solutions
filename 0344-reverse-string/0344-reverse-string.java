class Solution {
    public void reverseString(char[] s) {
        char snew[] = new char[s.length];
        for(int i = 0; i<s.length; i++){
            snew[i] = s[s.length-i-1];
        }
        for(int i = 0; i<s.length; i++){
            s[i] = snew[i];
        }
    }
}