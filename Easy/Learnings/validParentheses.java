//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
package Learnings;

import java.util.Stack;

/**
 *
 * @author root
 * tc -O(n)
 */
public class validParentheses {
    
    public static void main(String[] args) {
        String s = "(}";
        System.out.println(isvalid(s));
        
    }
    static boolean isvalid(String s){
   
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                if((stack.peek()=='(' && s.charAt(i)==')') || (stack.peek()=='{' && s.charAt(i)=='}' ) ||( stack.peek()=='[' && s.charAt(i)==']' )) stack.pop();
                else return false;
            }
        }
        
        return (stack.isEmpty());
    }
    
}