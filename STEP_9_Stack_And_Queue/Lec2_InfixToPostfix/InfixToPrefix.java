import java.util.Stack;

public class InfixToPrefix {
    static Stack<Character> stack = new Stack<>();
    static String postFix;

    static String changeInfixToPrefix(String infix) {
        StringBuilder sb = new StringBuilder(infix);
        // we can also reverse by using temp variable
        // Step -1
        sb.reverse();
        infix = sb.toString();
        char[] chars = infix.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(')
                chars[i] = ')';
            else if (chars[i] == ')')
                chars[i] = '(';
        }
        String result = infixToPostfix(chars);
        // Step -3
        return new StringBuilder(result).reverse().toString();
    }

    // Step -2
    static String infixToPostfix(char[] chars) {
        postFix = "";
        for (char ch : chars) {
            if (Character.isLetter(ch))
                postFix += ch;
            else {
                if (ch == '(')
                    stack.push(ch);
                else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postFix += stack.pop();
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && checkPriority(ch) <= checkPriority(stack.peek())) {
                        postFix += stack.pop();
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.empty()) {
            postFix += stack.pop();
        }
        return postFix;
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
        String input =  ("(p+q)*(c-d)");
        String output = changeInfixToPrefix(input);
        System.out.println("Infix expression: " + input);
        System.out.print("Prefix expression: ");
        System.out.print(output);
    }
}
