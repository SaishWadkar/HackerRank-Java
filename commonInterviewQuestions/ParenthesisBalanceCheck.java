package commonInterviewQuestions;

import java.util.Stack;

public class ParenthesisBalanceCheck {

    public static void main(String[] args){

        String s = "{[(]}";

        Stack<Character> stack = new Stack();
//        System.out.println(s.length());
//        System.out.println(stack);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
//            System.out.println(ch);
            if(ch=='{' || ch=='[' || ch =='('){
                stack.push(ch);
                System.out.println("Stack : "+stack);
            }
            if(ch=='}' || ch==']' || ch ==')'){
                char top = stack.peek();
                System.out.println(top);
                if((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']') ){
                    System.out.println("Item removed : "+stack.pop());
                }
            }
        }
        System.out.println("Stack : "+stack);
        if(stack.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }



    }

}
