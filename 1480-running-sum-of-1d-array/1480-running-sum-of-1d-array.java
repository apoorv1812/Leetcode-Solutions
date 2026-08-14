class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        int sum1 = 0;
        for(int i = 0; i<nums.length; i++){
            sum1 = nums[i] + sum1;
            sum[i] = sum1;
        } 
        return sum;
    }
}