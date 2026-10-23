class Solution {
    public int majorityElement(int[] nums) {
       int cnt =0;
       int el =0;

       for(int i =0;i <  nums.length; i++){
        if(cnt == 0){
            el = nums[i];
            cnt++;
        }else if(nums[i] == el){
            cnt++;
        }else{
            cnt--;
        }
       }

       int cnt1 = 0;
       for(int i =0; i< nums.length;i++){
        if(nums[i] == el){
            cnt1++;
        }
       }

       return cnt1 > (nums.length)/2 ? el : -1;
    }
}