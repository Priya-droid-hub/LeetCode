class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> mp = new HashSet<>();

        for(int num : nums){
            mp.add(num);
        }
        int i = 1;
        while(true){
            int m = i * k;
            if(!mp.contains(m)){
                return m;
            }
            i++;
        }
    }
}