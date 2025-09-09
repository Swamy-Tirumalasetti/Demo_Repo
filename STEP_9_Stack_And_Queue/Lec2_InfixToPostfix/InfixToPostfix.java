
import java.util.Stack;

class infixToPostfix {
    // Function to convert an infix expression to a postfix expression.
    static Stack<Character> stack = new Stack<>();
    static String ans;

    public static String changeInfixToPostfix(String s) {
       ans = "";
        // for(int i = 0; i<s.length(); i++){
        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch))
                ans += ch;
            else {
                if (ch == '(')
                    stack.push(ch);
                else if (ch == ')') {
                    while (!stack.empty() && stack.peek() != '(') {
                        ans += stack.pop();
                    }
                    stack.pop();
                } else {
                    while (!stack.empty() && checkPriority(ch) <= checkPriority(stack.peek())) {
                        ans += stack.pop();
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.empty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            ans += stack.pop();
        }
        return ans;
    }

    static int checkPriority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String output = changeInfixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println(output);
    }
}
