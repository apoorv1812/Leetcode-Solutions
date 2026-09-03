class Solution {
    public int lengthOfLastWord(String s) {
        s = reverse(s);
        String str = "";
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == ' '){
                break;
            } 
            str += s.charAt(i);
        }
        return str.length();
    }
    public static String reverse(String s){
        String srev = "";
        for(int i = s.length() - 1; i>=0; i--){
            srev += s.charAt(i);
        }
        StringBuilder sb = new StringBuilder(srev);
        int j = 0;
        while(j<sb.length() && sb.charAt(j) == ' '){
            j++;
        }
        sb.delete(0, j);
        return sb.toString();
    }
}