class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if(k < 0 || k > n){
            return -1;
        }

        if(k == 0){
            return 0;
        }

        if(k == n){
            int total = 0;

            for(int i =0;i < n;i++){
                total += cardPoints[i];
            }
            return total;
        }

        int max =0;

        for(int i =0;i< k;i++){
            max += cardPoints[i];
        }
        int sum = max;
        int right = n - 1;

        for(int i = k-1; i>=0;i--){
            sum -= cardPoints[i];
            sum += cardPoints[right];
            right--;

            max = Math.max(sum,max);
        }
        return max;
    }
}