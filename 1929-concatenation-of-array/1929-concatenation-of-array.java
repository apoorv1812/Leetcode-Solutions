class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_nums[] = new int[2*nums.length];
        for(int i = 0; i<nums.length; i++){
            new_nums[i] = nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            new_nums[i+nums.length] = nums[i];
        }
        return new_nums;
    }
}