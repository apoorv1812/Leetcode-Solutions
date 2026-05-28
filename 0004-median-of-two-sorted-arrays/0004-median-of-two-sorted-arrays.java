        class Solution {
            public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                int[] nums3 = new int[nums1.length+nums2.length];
                for(int i = 0; i<nums1.length; i++){
                    nums3[i] = nums1[i];
                }
                for(int i = 0; i<nums2.length; i++){
                    nums3[nums1.length+i] = nums2[i];
                }
                for(int i = 0; i<nums3.length; i++){
                    for(int j = i+1; j<nums3.length ;j++){
                        if(nums3[i] > nums3[j]){
                            int temp = nums3[i];
                            nums3[i] = nums3[j];
                            nums3[j] = temp;
                        }
                    }
                }
                if(nums3.length%2 == 0){
                    int i = (nums3.length)/2;
                    int j = i-1;
                    double median = ((double)(nums3[i])+(double)(nums3[j]))/2;
                    return median;
                }
                else{
                    int median = nums3[(nums3.length-1)/2];
                    return median;
                }
            }
        }