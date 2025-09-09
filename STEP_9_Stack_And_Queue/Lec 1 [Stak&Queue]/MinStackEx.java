import java.util.Stack;

class MinStackEx {

    Stack<Long> stack = new Stack<>();
    Long min = Long.MAX_VALUE;

    public void push(int val) {
        Long x = Long.valueOf(val);
        if (stack.empty()){
            stack.push(x);
            min = x;
        }
        else
            if(x >= min) stack.push(x);
        stack.push(2*x-min);
    }

    public void pop() {
        if (stack.empty())
            return;
        Long popped = stack.pop();
        if(popped < min)min = 2*min -popped;
    }

    public int top() {
        if (stack.empty())
            return -1;
        int popped = stack.peek().intValue();
        if(popped<min)return min.intValue();
        return popped;
    }

    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */