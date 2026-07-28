class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;
        
        while(n != 0){
            int lastDigit = n % 10;
            if(max1 <= lastDigit){
                max2 = max1;
                max1 = lastDigit;
            }else if(max2 < lastDigit){
                max2 = lastDigit;
            }
            n /= 10;
            
        }

        return max2 * max1;
    }
}