class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int revimage[][] = new int[image.length][image[0].length]; 
        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image[0].length; j++){
                revimage[i][j] = image[i][image.length-1-j];
            }
        }
        for(int m = 0; m<image.length; m++){
            for(int n = 0; n<image[0].length; n++){
                image[m][n] = revimage[m][n]^1;
            }
        }
        return image;
    }
}