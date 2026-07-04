class Solution {
    public int capacityL(int[] weight, int cap) {

        int day = 1;
        int load = 0;
        for( int n : weight){
            if((load + n) > cap){
                day = day + 1;
                load = n;
            }else{
                load += n;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high =  Arrays.stream(weights).sum();
        int ans = high;
        while(low <= high){
            int mid = low + ( high - low)/2;

            if(capacityL(weights,mid) <= days){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}