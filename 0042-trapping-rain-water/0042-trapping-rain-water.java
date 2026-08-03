class Solution {
    public int trap(int[] arr) {
        int lmax =0, rmax= 0, total = 0;
        int n = arr.length;
        int l =0;
        int r = n-1;

        while(l <= r){
            if(arr[l] <= arr[r]){
                if(arr[l] < lmax){
                    total += lmax - arr[l];
                }else{
                    lmax= arr[l];
                }
                l++;
            }else{
                if(arr[r] < rmax){
                    total += rmax - arr[r];
                }else{
                    rmax = arr[r];
                }
                r--;
            }
        }
        return total;
    }
}