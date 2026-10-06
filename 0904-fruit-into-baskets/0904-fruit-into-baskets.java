class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if(n == 0)  return 0;
        int left =0, right=0, maxlen=0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        while(right < n){
            mp.put(fruits[right], mp.getOrDefault(fruits[right],0)+1);

            while(mp.size() > 2){
                mp.put(fruits[left], mp.getOrDefault(fruits[left],0)-1);

                if(mp.get(fruits[left]) == 0){
                    mp.remove(fruits[left]);
                }
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);
            right++;
        }
        return maxlen;
    }
}