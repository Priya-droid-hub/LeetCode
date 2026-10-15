class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastseen = new HashMap<>();
        int maxlen =0, left =0;
        for(int right =0;right < s.length();right++){
            char current = s.charAt(right);

            if(lastseen.containsKey(current) && lastseen.get(current) >= left){
                left = lastseen.get(current)+1;
            }

            lastseen.put(current, right);
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}