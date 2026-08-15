class Solution {
    public int heightChecker(int[] heights) {
        int sortedarr[] = new int[heights.length];
        for(int i = 0; i<heights.length; i++){
            sortedarr[i] = heights[i];
        }
        for(int i = 0; i<heights.length; i++){
            for(int j = i+1; j<heights.length; j++){
                if(sortedarr[i]>sortedarr[j]){
                    int temp = sortedarr[i];
                    sortedarr[i] = sortedarr[j];
                    sortedarr[j] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i<heights.length; i++){
            if(sortedarr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}