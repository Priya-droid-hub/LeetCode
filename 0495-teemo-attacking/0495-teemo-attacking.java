class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0 || duration == 0 || timeSeries == null)   return 0;

        int count = 0;
        int start =timeSeries[0];
        int end = timeSeries[0]+duration;

        for(int i = 1; i < timeSeries.length; i++){
            if(timeSeries[i] > end){
                count += end - start;
                start = timeSeries[i];
            }
            end = timeSeries[i]+duration;
        }
        
        count += end - start;
        return count;
    }
}