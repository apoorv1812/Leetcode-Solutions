class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            int p = (n & 1);
            n = n>>1;
            int m = (n & 1);
            if(p==m){
                return false;
            }
        }
        return true;
    }
}