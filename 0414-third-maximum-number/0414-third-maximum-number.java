class Solution {
    public int thirdMax(int[] nums) {
        int[] sortedarr = sort(nums);

        int[] arr = new int[nums.length];
        int count = 0;
        arr[count] = sortedarr[0];
        count++;

        for (int i = 1; i < sortedarr.length; i++) {

            if (sortedarr[i] == sortedarr[i - 1]) {
                continue;
            }


            arr[count] = sortedarr[i];
            count++;

            if (count == 3) {
                break;
            }
        }

        if (count < 3) {
            return arr[0];
        }

        return arr[2];
    }

    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}