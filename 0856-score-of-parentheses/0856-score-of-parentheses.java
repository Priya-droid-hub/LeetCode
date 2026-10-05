class Solution {
    public int scoreOfParentheses(String s) {
        int open =0;
        int cnt =0;
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) =='('){
                open++;
            }else if(s.charAt(i) ==')'){
                open--;
                if(s.charAt(i-1) == '('){
                    cnt += 1 << open;
                }
            }
        }
        return cnt;
    }
}