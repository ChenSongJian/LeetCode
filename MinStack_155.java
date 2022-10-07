// 155. Min Stack

class MinStack {
    PriorityQueue<Integer> pq;
    LinkedList<Integer> ll;
    public MinStack() {
        pq = new PriorityQueue<>();
        ll = new LinkedList<>();
    }
    
    public void push(int val) {
        pq.add(val);
        ll.addLast(val);
    }
    
    public void pop() {
        pq.remove(ll.removeLast());
    }
    
    public int top() {
        return ll.getLast();
    }
    
    public int getMin() {
        return pq.peek();
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
