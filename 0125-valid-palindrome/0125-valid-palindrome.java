class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        String news = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if('a'<=c && c<='z' || '0'<=c && c<='9'){
                news = news + c; 
            }
        }
        int left = 0;
        int right = news.length() - 1;
        int count = 0;
        while(left<right){
            if(news.charAt(right) == news.charAt(left)){
                left++;
                right--;
                count++;
            }
            else{
                break;
            }
        }
        if(count == news.length()/2){
            return true;
        }
        return false;
    }
}