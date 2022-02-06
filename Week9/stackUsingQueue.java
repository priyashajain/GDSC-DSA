class MyStack {
    Queue<Integer> mq;
    Queue<Integer> hq;

    public MyStack() {
        mq = new ArrayDeque<>();
        hq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        mq.add(x);
    }
    
    public int pop() {
        if(mq.size() == 0){
            return -1;
        }
        else{
            while(mq.size()>1){
                hq.add(mq.remove());
            }
            int popval = mq.remove();
            mq = hq;
            hq = new ArrayDeque<>();
            
            return popval;
            
        }
        
    }
    
    public int top() {
        if(mq.size() == 0){
            return -1;
        }
        else{
            while(mq.size()>1){
                hq.add(mq.remove());
            }
            int topval = mq.remove();
            hq.add(topval);
            mq = hq;
            hq = new ArrayDeque<>();
            
            return topval;
            
        }
    }
    
    public boolean empty() {
        if(mq.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}