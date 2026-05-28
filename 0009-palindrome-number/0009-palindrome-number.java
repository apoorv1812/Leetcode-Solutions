class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int f = x;
        while(x!=0){
            int d = x%10;
            n = n*10 + d; 
            x = x/10;
        }
        if(f<0)
        return false;
        else if(f==n)
        return true;
        else
        return false;
    }
}