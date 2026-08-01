class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nextGreater = new int[10001];
        Stack<Integer> st = new Stack<>();

        for(int i = n -1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            nextGreater[nums2[i]] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }

        int m = nums1.length , i = 0;

        while(i < m){
             nums1[i] = nextGreater[nums1[i]];
             i++;
        }

        return nums1;
    }
}