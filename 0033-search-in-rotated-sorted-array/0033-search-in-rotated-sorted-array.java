class Solution {

    static int search(int[] nums, int target) {

        int pivot = findpivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // Pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Target is in the left sorted part
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Target is in the right sorted part
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarysearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    static int findpivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid itself is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: element before mid is the pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Search right side
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            }
            // Search left side
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}