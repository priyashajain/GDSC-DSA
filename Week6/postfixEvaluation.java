class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch>='0' && ch<='9'){
                st.push(ch-'0');
            }
            else{
                int v2 = st.pop();
                int v1 = st.pop();
                int val = operation(v1, v2, ch);
                st.push(val);
            }
        }
        return st.pop();
    }
    
    public static int operation(int v1, int v2, char op){
        if(op=='+'){
            return (v1+v2);
        }
        else if(op=='-'){
            return (v1-v2);
        }
        else if(op=='*'){
            return (v1*v2);
        }
        else{
            return (v1/v2);
        }
    }
}