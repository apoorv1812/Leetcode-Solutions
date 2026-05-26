class Solution {
    public int[] plusOne(int[] digits) {
        boolean AllNine = true;
        for(int i = 0; i<digits.length; i++){
            if(digits[i] != 9){
                AllNine = false; 
            }
        }
        if(AllNine){
            int[] PlusOne = new int[digits.length+1];
            PlusOne[0] = 1; 
            for(int i = 1; i<digits.length+1; i++){
                PlusOne[i] = 0;
            }  
            return PlusOne;
        }
        else{
            int[] PlusOne = new int[digits.length];
            for(int i = 0; i<digits.length; i++){
                PlusOne[i] = digits[i];
            }
            for(int i = digits.length-1; i>=0; i--){
                if(PlusOne[i]==9){
                    PlusOne[i] = 0; 
                }
                else{
                    PlusOne[i] = PlusOne[i] + 1;
                    break;
                }
            }
            return PlusOne;
        }
    }
}
