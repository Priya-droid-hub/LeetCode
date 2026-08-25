class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double maxAv = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for (int right = 0; right < nums.length; right++){
            sum += nums[right];

            if(right-left+1 == k){
                maxAv = Math.max(maxAv , sum);
                sum -= nums[left];
                left++;
            }
        }
        
        return maxAv/k;
    }
}