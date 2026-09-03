class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        while(i<ans.length){
            int max = nums1[i];
            for(int j = 0; j<nums2.length; j++){
                if(max == nums2[j]){
                    while(j<nums2.length){
                        if(nums2[j]>max){
                            max = nums2[j];
                            break;
                        }
                        j++;
                    }
                    if(max == nums1[i]){
                        ans[i] = -1;
                    }
                    else{
                        ans[i] = max;
                    }
                }
            }
            i++;
        }
        return ans;
    }
}