class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxlen = 0;
        int left = 0;

        for(int right = 0 ; right < nums.length; right++){
            // Add current element to the map
            mp.put(nums[right] , mp.getOrDefault(nums[right],0)+1);
            
            // If frequency of current element becomes greater than k,
            // shrink the window from the left
            while(mp.get(nums[right]) > k){

                // Decrease frequency of the left element
                mp.put(nums[left], mp.get(nums[left])-1);
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}