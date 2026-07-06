class Solution {
    public int isPossible(int[] nums, int maxSum){
        int partitionss = 1;
        int sum = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(sum + nums[i] > maxSum){
                partitionss++;
                sum = nums[i];
            }else{
                sum += nums[i];
            }
        }
        return partitionss;
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high =Arrays.stream(nums).sum();

        while(low <= high){
            int mid = low + (high - low)/2;
            int partitions = isPossible(nums,mid);

            if(partitions > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}