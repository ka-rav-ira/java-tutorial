package Stacks;
import java.util.Stack;
public class MinAddToMakeValid2 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int additions = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }else{
                    additions++;
                }
            }
        }
        return additions + stack.size();
    }
}

