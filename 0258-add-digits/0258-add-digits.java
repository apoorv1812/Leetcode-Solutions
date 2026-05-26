class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            num = num+rem;
            if(num<10){
                sum = num;
                break;
            }
        }
        return num;
    }
}