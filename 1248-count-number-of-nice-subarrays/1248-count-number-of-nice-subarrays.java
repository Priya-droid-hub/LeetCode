class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }

    int atmost(int[] nums, int k){

        int left =0, sum =0,cnt=0;

        for(int right=0;right<nums.length;right++){
            sum += nums[right]%2;

            while(sum > k && left <= right){
                sum -= nums[left]%2;
                left++;
            }

            cnt += right-left+1;
        }
        return cnt;
    }
}