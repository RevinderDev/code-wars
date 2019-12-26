import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces){
        Stack<Character> openBrackets = new Stack<>();
        for(int i = 0; i< braces.length(); ++i)
        {
            if(!openBrackets.isEmpty()) {
                if (matchPair(openBrackets.peek(), braces.charAt(i)))
                    openBrackets.pop();
                else
                    openBrackets.push(braces.charAt(i));
            }
            else
                openBrackets.push(braces.charAt(i));
        }

     return openBrackets.isEmpty();
    }

    
    public boolean matchPair(char stackTop, char newBrace) {
       switch (newBrace) {
            case '}':
                if (stackTop == '{')
                    return true;
                break;
            case ']':
                if (stackTop == '[')
                    return true;
                break;
            case ')':
                if (stackTop == '(')
                    return true;
                break;
            default:
                break;
        }
        return false;
  }
}