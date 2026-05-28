class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean found = false;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                found = true;
            }
        }
        if(found){
            for(int i = 0; i<nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
        }
        else{
            for(int i=0; i<nums.length; i++){
                if(nums[i]<target){
                    if(nums[nums.length-1]<target){
                        return nums.length;
                    }
                }
                else{
                    return i;
                }
            }
        }
        return 0;
}
}