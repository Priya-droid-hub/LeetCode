class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            int pos = i+1;
            int value = 26 - (c - 'a');
            result += pos * value;
        }

        return result;
    }
}