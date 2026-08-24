class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] anss = new int[arr.size()];
        int m = 0;

        for (int num : arr) {
            anss[m++] = num;
        }

        return anss;
    }
}