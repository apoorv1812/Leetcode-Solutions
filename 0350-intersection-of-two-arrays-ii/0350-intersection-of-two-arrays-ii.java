class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums2.length <= nums1.length){
            boolean used[] = new boolean[nums1.length];
            for(int i = 0; i<nums2.length; i++){
                for(int j = 0; j<nums1.length; j++){
                    if(nums2[i] == nums1[j] && !used[j]){
                        list.add(nums2[i]);
                        used[j] = true;
                        break;
                    }
                }
            }
        }
        else{
            boolean used[] = new boolean[nums2.length];
            for(int i = 0; i<nums1.length; i++){
                for(int j = 0; j<nums2.length; j++){
                    if(nums2[j] == nums1[i] && !used[j]){
                        list.add(nums2[j]);
                        used[j] = true;
                        break;
                    }
                }
            }
        }
        int[] intersection = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            intersection[i] = list.get(i);
        }
        return intersection;
    }
}