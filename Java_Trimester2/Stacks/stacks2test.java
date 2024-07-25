import java.util.Stack;

public class stacks2test {
    //1 Balanced Paranthesis
    //2
    //3 Rebaundant braces

    //3
    /* */
     public int braces(String A) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<A.length();i++) {
            char ch=A.charAt(i);
            if(ch=='(' || ch=='+' ||ch=='-' || ch=='*' || ch=='/') {
                st.push(ch);
            }
            else if(ch==')') {
                if(st.peek()=='('){
                    return 1;
                }
                else {
                    while(st.peek()!='(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            
        }
        return 0;
    
    }
    //1 Balanced Paranthesis
    public int solve(String A) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<A.length();i++) {
            char ch=A.charAt(i);
        if(ch=='('||ch=='{'||ch=='[') {
            st.push(ch);
        }
        else if(!st.isEmpty() && ch==')' && st.peek()=='('){
            st.pop();
        }
        else if(!st.isEmpty() && ch=='}' && st.peek()=='{'){
            st.pop();
        }
        else if(!st.isEmpty() && ch==']' && st.peek()=='['){
            st.pop();
        }
        else {
            return 0;
        }
    }
        
        if(!st.isEmpty()) {
            return 0;
        }
        return 1;
        
    }
    
}
