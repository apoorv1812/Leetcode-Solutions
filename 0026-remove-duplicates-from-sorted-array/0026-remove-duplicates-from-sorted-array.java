class Solution {
    public static int removeDuplicates(int[] nums) {
        int newarr[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            boolean Duplicates = false;
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    Duplicates = true;
                    break;
                }
            }
            if(!Duplicates){
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