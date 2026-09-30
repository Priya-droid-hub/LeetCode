class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPosition = 0;

        for(int current =0;current < nums.length; current++){
            if(nums[current] != 0){
                int temp = nums[current];
                nums[current] = nums[zeroPosition];
                nums[zeroPosition] = temp;

                zeroPosition++;
            }
        }
    }
}