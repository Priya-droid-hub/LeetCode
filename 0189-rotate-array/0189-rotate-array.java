class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, d-1);
        reverse(nums,d,n-1);
    }

    public void reverse(int[] nums, int s, int e){
        int start =s;
        int end = e;
         
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}