class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> minS = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minS.isEmpty() || minS.peek() >= val){
          minS.push(val);
        }
        s.push(val);
    }

    public void pop() {
        if(s.peek().equals(minS.peek())){
            minS.pop();
        }
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
