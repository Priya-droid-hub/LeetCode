class Solution {
    public static boolean possible(int[] arr, int day,int m,int k){
        int cnt = 0, noofB = 0;
        for(int i : arr){
            if( i <= day){
                cnt++;
            }else{
                noofB += (cnt/k);
                cnt = 0;
            }
        }
        noofB += (cnt/k);

        return noofB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        if(val > bloomDay.length)   return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i : bloomDay){
            maxi = Math.max(maxi,i);
            mini = Math.min(mini,i);
        }

        int low = mini, high = maxi;
        int ans = maxi;
        while( low <= high){
            int mid = low + ( high - low)/2;

            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}