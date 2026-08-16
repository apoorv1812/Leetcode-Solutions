class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length>=nums2.length){
            int count = 0; 
            int intersect[] = new int[nums2.length];
            for(int i  = 0; i<nums2.length; i++){
                for(int j = 0; j<nums1.length; j++){
                    if(nums2[i] == nums1[j]){
                        boolean alreadythere = false;

                        for(int k = 0; k<count; k++){
                            if(intersect[k] == nums1[j]){
                                alreadythere = true;
                                break;
                            }
                        }

                        if(!alreadythere){
                            intersect[count] = nums1[j];
                            count++;
                        }
                            break;
                    }
                }
            }
            int ans[] = new int[count];
            for(int i = 0; i<count; i++){
                ans[i] = intersect[i];
            }
            return ans;
        }
        else{
            int count = 0;
            int intersect[] = new int[nums2.length];
            for(int i = 0; i<nums1.length; i++){
                for(int j = 0; j<nums2.length; j++){
                    if(nums1[i]==nums2[j]){
                        boolean alreadythere = false;

                        for(int k = 0; k<count; k++){
                            if(intersect[k] == nums2[j]){
                                alreadythere = true;
                                break;
                            }
                        }

                        if(!alreadythere){
                            intersect[count] = nums2[j];
                            count++;
                        }
                            break;
                    }
                }
            }
            int ans[] = new int[count];
            for(int i = 0; i<count; i++){
                ans[i] = intersect[i];
            }
            return ans;
        }
    }
}