class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int balance = 0;

        for(int i=0; i< nums.length;i++){
            if(balance == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                balance += 1;
            }else{
                balance -= 1;
            }
        }
        return candidate;
    }
}