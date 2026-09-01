class Solution {
   public static int findGCD(int[] nums) {
        nums = sort(nums);
        return gcd(nums[nums.length - 1], nums[0]);
    }
    public static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }
        return gcd(b , a%b);
    }
    public static int[] sort(int[] nums){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}