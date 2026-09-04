class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i<nums.length - k + 1; i++){
            int sum = 0;
            for(int j = i; j< i + k ; j++){
                sum+=nums[j];
            }
            ans[index] = sum;
            index++;
        }
        double max = Integer.MIN_VALUE/1.0;
        for(double n : ans){
            if(n > max){
                max = n;
            }
        }
        return (max/k);
    }
}