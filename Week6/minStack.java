class MinStack {

    Stack<Integer> data;
    int min; 
    
    public MinStack() {
        data = new Stack<>();
    }
    
    public void push(int val) {
        if(data.size()==0){
            data.push(val);
            min=val;
        }
        else if(val>=min){
            data.push(val);
        }
        else{
            data.push(val+val-min);
            min=val;
        }
    }
    
    public void pop() {
       
            if(data.peek()>=min){
                data.pop();
            }
            else{
                
                min = 2*min - data.pop();
                
            }
        
    }
    
    public int top() {
        
            if(data.peek()>=min){
                return data.peek();
            }
            else{
                return min;
            }
        
    }
    
    public int getMin() {
        return min;
    }
}
