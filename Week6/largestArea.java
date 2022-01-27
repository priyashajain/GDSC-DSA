class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        int[] lb = new int[heights.length];
        int[] rb = new int[heights.length];
        
        lb[0] = -1;
        rb[heights.length-1] = heights.length;
        
        for(int i=1;i<heights.length;i++){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        st.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=heights.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int ht = heights[i];
            int len = rb[i]-lb[i]-1;
            int area = ht*len;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}