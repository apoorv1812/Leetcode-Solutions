class Solution {
    public static int removeElement(int[] nums, int val) {
        int newarr[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                newarr[count] = nums[i];
                count++;
            }
        }
        int result[] = new int[count];
        for(int i = 0; i<count; i++){   
            result[i] = newarr[i];
        }
        for(int i = 0; i<count; i++){
            nums[i] = result[i];
        }
        return count;
    }
}