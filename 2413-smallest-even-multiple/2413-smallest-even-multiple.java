class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2 == 0){
            return n;
        } 
        return n*2/gcd(2,n);
    }
    public int gcd(int a, int b) {
        if(b%a == 0){
            return a;
        }
        return gcd(b%a, a);   
    }
}