class Solution {
     public static void moveZeroes(int[] nums) {
        int count = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        // Fill the remaining positions with zeroes
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
     }
}