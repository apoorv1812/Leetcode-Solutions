class Solution {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int newnums[] = new int[nums.length];
        int count = 0;
        for(int i = nums.length-k; i<nums.length; i++){
            newnums[count] = nums[i];
            count++;
        }
        int j = count;
        for(int i = 0; i<nums.length-k; i++){
            newnums[j] = nums[i];
            j++;
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = newnums[i];
        }
    }
}