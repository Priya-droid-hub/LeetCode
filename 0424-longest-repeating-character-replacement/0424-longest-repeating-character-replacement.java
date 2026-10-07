class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        if(n == 0|| k < 0) return 0;
        
        int[] freq = new int[26];

        int maxcount =0, maxlen =0, left =0;

        for(int right =0;right < n;right++){
            freq[s.charAt(right)-'A']++;

            maxcount = Math.max(maxcount, freq[s.charAt(right)-'A']);

            while((right-left+1) - maxcount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);
        }

        return maxlen;
    }
}