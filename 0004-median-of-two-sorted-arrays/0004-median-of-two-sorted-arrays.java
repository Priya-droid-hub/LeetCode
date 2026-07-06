class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length]; //creating array
        System.arraycopy(nums1, 0, result, 0, nums1.length); //Copy from nums1..Start from index 0..Paste into result..Start at index 0..Copy total nums1.length elements
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length); //Copy from nums2..Start from index 0..Paste into result..Start at index nums1.length..Copy total nums2.length elements
        
        Arrays.sort(result);
        int n = result.length;
        if(n % 2 == 0){
            return (result[n/2]+result[n/2 - 1]) / 2.0;
        }else{
            return result[n/2];
        }
    }
}