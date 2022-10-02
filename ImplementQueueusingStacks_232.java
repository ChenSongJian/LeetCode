// 232. Implement Queue using Stacks

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MyQueue() {
        this.s1 = new Stack<Integer>();
        this.s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while (s2.isEmpty() == false) {
            s1.push(s2.pop());
        }
        s1.push(x);
        while (s1.isEmpty() == false) {
            s2.push(s1.pop());
        }
    }
    
    public int pop() {
        return s2.pop();
    }
    
    public int peek() {
        return s2.peek();
    }
    
    public boolean empty() {
        return s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
