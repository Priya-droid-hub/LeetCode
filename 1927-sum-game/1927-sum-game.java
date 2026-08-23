class Solution {
    public boolean sumGame(String num) {
        int count = 0;
        int diff = 0;
        int n = num.length();    
        for(int i = 0;i < n; i++){
            boolean firstHalf = i < n / 2;

            if(num.charAt(i) == '?'){
                count += firstHalf ? 1 : -1;
            }else{
                int digit = num.charAt(i) - '0';
                diff += firstHalf ? digit : -digit;
            }
        }

        return 2 * diff != -9 * count;
    }
}