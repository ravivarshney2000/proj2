package infix.postfix;

import java.util.Stack;
public class InfixToPostfix {
    public String infixToPOstfix(String infixString){
        String postfix="";
        Stack<Character> stack = new Stack<>();//DIAMOND SYNTAX

        //STEP 1
        stack.push('(');
        infixString=infixString.concat(")");
        for (int i = 0; i < infixString.length(); i++) {  //COMPLEXITY OF ALL CODE IS O(N^2)

            //STEP 2
            char character=infixString.charAt(i);

            //STEP 3
            if (Character.isAlphabetic(character)){
                postfix=postfix.concat(""+character);//char to string
            }

            //STEP 4
            else if (character=='('){
                stack.push(character);
            }

            //STEP 5
            else if (isOperator(character)){
                if (stack.peek()!='('){
                    while ( !stack.empty()){

                        if (precedence(stack.peek()) ==3 && precedence(character)==3) {
                            stack.push(character);
                            break;
                        }
                        else if (precedence(stack.peek()) >= precedence(character)) {
                            postfix = postfix.concat(""+stack.pop());
                        }

                        else{
                            stack.push(character);
                            break;
                        }
                    }
                }


                else {
                    stack.push(character);
                }
            }

            //STEP 6
            else if (character==')'){
                while (!stack.empty()){
                    if (stack.peek()!='('){
                        postfix = postfix.concat(""+stack.pop());
                    }
                    else{
                        stack.pop();
                        break;
                    }
                }
            }

        }
        return postfix;
    }
    private int precedence(char operator){
        int responce=0;
        switch (operator){
            case '^':
                responce=3;
                break;
            case '/':
            case '*':
                responce=2;
                break;
            case '+':
            case '-':
                responce=1;
        }
        return responce;
    }
    private boolean isOperator(char operator){
        boolean responce=false;
        switch (operator){
            case '^':
            case '/':
            case '*':
            case '+':
            case '-':
                responce=true;
        }
        return responce;
    }
}
