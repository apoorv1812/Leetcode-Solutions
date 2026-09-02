class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] answer = new int[nums.length];

        // Store product of everything to the LEFT
        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {

            answer[i] = leftProduct;

            leftProduct = leftProduct * nums[i];
        }

        // Multiply by product of everything to the RIGHT
        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            answer[i] = answer[i] * rightProduct;

            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }
}