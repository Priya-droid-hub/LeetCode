class Solution {
    public long totalHours(int[] arr, int speed){
        long total_hrs = 0;
        for(int bananas : arr){
            total_hrs += (int)Math.ceil((double)bananas / speed);
        }
        return total_hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = max;
        int ans = max;
        while( low <= high){
            int mid = low + (high - low) / 2;
            long totalhrs = totalHours(piles, mid);

            if(totalhrs <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}