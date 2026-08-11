class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        int nse =0, pse =0;
        for(int i= 0; i < n;i++){

            while(!st.isEmpty() && heights[st.peek()]> heights[i]){
                int element = st.peek();
                st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();

                maxArea = Math.max(maxArea , ((nse - pse - 1)*heights[element]));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int element = st.peek();
            st.pop();
            nse = n;
            pse = st.isEmpty() ? -1 : st.peek();

            maxArea = Math.max(maxArea , ((nse - pse - 1)*heights[element]));
        }

        return maxArea;
    }
}