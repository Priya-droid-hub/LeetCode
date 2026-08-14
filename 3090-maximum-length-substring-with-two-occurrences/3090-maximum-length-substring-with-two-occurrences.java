class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = -1;
        int[] freq = new int[26];
        int result = 0;
        while (right + 1 < s.length()) {
            char c = s.charAt(++right);
            freq[c - 'a']++;
            while (freq[c - 'a'] > 2) {
                freq[s.charAt(left++) - 'a']--;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}