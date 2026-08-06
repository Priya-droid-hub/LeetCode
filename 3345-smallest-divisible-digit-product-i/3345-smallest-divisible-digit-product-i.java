class Solution {
    public int smallestNumber(int n, int t) {
        while(product(n)%t != 0){
            n++;
        }
        return n;
    }

    int product(int n){
        int multiple =1;
        while( n != 0){
            int reminder =n%10;
            n = n / 10;
            multiple *= reminder;
        }
        return multiple;
    }
}