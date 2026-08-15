class Solution {
    public int[] sortedSquares(int[] nums) {
        int squarr[] = new int[nums.length]; 
        for(int i = 0; i<nums.length; i++){
            squarr[i] = nums[i]*nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(squarr[i]>squarr[j]){
                    int temp = squarr[i];
                    squarr[i] = squarr[j];
                    squarr[j] = temp; 
                }
            }
        }
        return squarr;
    }
}