class Solution {
    public int maxDepth(String s) {
        int p = 0;
        int max = Integer.MIN_VALUE;

        for(char c : s.toCharArray()){
            if(c == '('){
                p++;
            }else if(c == ')'){
                p--;
            }
            max = Math.max(max,p);
        }
        return max;
    }
}