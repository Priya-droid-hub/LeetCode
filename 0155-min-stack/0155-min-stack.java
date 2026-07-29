class MinStack {

    private Stack<Long> st;
    long mini = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        long val = value;
        if(st.empty()){
            mini = val;
            st.push(val);
        }else{
            if( val >= mini){
                st.push(val);
            }else{
                st.push(2 * val - mini);
                mini = val;
            }
        }
    }
    
    public void pop() {
        if(st.empty()){
            return;
        }
        long val = st.peek();
        st.pop();

        if( val < mini){
            mini = 2 * mini - val;
        }
    }
    
    public int top() {
        if(st.empty()){
            return -1;
        }

        long x = st.peek();

        if( x < mini){
            return (int) mini;
        }

        return (int) x;
    }
    
    public int getMin() {
        return (int) mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */