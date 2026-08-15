class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merge[] = new int[m+n];
        for(int i = 0; i<m; i++){
            merge[i] = nums1[i];
        }
        for(int i = 0; i<n; i++){
            merge[i+m] = nums2[i];
        }
        for(int i = 0; i<n+m; i++){
            for(int j = i+1; j<n+m; j++){
                if(merge[i]>merge[j]){
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        for(int i = 0; i<n+m; i++){
            nums1[i] = merge[i];
        }
    }
}