class MyQueue {
    Stack<Integer> mst;
    Stack<Integer> hst;
    
    public MyQueue() {
        mst = new Stack<>();
        hst = new Stack<>();
    }
    
    public void push(int x) {
        mst.push(x);
    }
    
    public int pop() {
        if(mst.size()==0){
            return -1;
        }
        else{
            while(mst.size()>1){
                hst.push(mst.pop());
            }
            int popval = mst.pop();
            while(hst.size()>0){
                mst.push(hst.pop());
            }
            return popval;
        }
    }
    
    public int peek() {
        if(mst.size()==0){
            return -1;
        }
        else{
            while(mst.size()>1){
                hst.push(mst.pop());
            }
            int topval = mst.peek();
            hst.push(mst.pop());
            while(hst.size()>0){
                mst.push(hst.pop());
            }
            return topval;
        }
    }
    
    public boolean empty() {
        if(mst.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
