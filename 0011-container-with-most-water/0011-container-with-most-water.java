class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxarea = 0;

        while( left < right){
            int heightt = right - left ;

            int width = Math.min(height[left], height[right]);

            int max = heightt * width;
            maxarea = Math.max(max, maxarea);

            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }

        }
        return maxarea;
    }
}