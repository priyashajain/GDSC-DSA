class Solution
{
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String exp) 
	{
		Stack<Character> st = new Stack<>();
		String ans = "";
		for(int i=0; i<exp.length(); i++){
		    char ch = exp.charAt(i);
		    if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
		        ans+=ch;
		    }
		    else if(ch=='('){
		        st.push(ch);
		    }
		    else if(ch==')'){
		        while(st.peek()!='('){
		            ans+=st.pop();
		        }
		        st.pop();
		    }
		    else{
		        while(st.size()>0 && st.peek()!='(' && (precedence(st.peek())>=precedence(ch) )){
		            ans+=st.pop();
		        }
		        st.push(ch);
		    }
		}
		while(st.size()>0){
		    ans+=st.pop();
		}
		return ans;
	} 
	public static int precedence(char op){
	    if(op=='^'){
	        return 3;
	    }
	    else if(op=='*' || op=='/'){
	        return 2;
	    }
	    else{
	        return 1;
	    }
	}
}