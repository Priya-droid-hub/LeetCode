class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int sum = nums[0];
        for(int i : nums){
            st.add(i);
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]+1){
                sum += nums[i];
            }else{
                break;
            }
        }

        while(st.contains(sum)){
            sum++;
        }

        return sum;
    }
}