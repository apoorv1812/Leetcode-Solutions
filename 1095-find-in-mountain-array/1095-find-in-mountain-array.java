/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start<end){
            int mid = (start + end)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        int start1 = 0;
        int end1 = start;
        int start2 = end1 + 1;
        int end2 = mountainArr.length() - 1;
        while(start1<=end1){
            int mid = (start1 + end1)/2;
            if(target==mountainArr.get(mid)){
                return mid;
            }
            else if(target<mountainArr.get(mid)){
                end1 = mid - 1;
            }
            else{
                start1 = mid + 1;
            }
        }
        while(start2<=end2){
            int mid = (start2 + end2)/2;
            if(target==mountainArr.get(mid)){
                return mid;
            }
            else if(target<mountainArr.get(mid)){
                start2 = mid + 1;
            }
            else{
                end2 = mid - 1;
            }
        }
        return -1;
    }
}