class Solution {
    public int missingNumber(int[] nums) {
        int k = nums.length;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        if(nums[nums.length-1]!=k){
            return k;
        }
        else{
            for(int i = 0; i<nums.length; i++){
                if(i!=nums[i]){
                    return i;
                }
            }
        }
        return 0;
    }
}