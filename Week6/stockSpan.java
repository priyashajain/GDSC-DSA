class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] leftMax = new int[price.length];
        leftMax[0] = 1;
        for(int i=1;i<price.length;i++){
            while(st.size()>0 && price[st.peek()]<=price[i]){
                st.pop();
            }
            if(st.size()==0){
                leftMax[i] = i+1;
            }
            else{
                leftMax[i] = i-st.peek();
            }
            st.push(i);
        }
        return leftMax;
    }
    
}