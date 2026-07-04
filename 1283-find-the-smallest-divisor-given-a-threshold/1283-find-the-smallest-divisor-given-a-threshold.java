class Solution {
    public int sunDivisor(int[] num, int limit){
        int sum = 0;
        for(int i :num){
            sum += Math.ceil((double)i / limit);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(sunDivisor(nums, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}