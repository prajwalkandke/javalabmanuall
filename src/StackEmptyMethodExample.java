
import javax.xml.transform.Result;
import java.util.Stack;
public class StackEmptyMethodExample {
    private static boolean result;

    public static void main(String[]args)
    {
        //creating instance of stack
        Stack<Integer> stk= new Stack<>();
        String Result;
        System.out.println("Is the stack empty?" + result );
        // push element in stack
        stk.push(78);
        stk.push(20);
        stk.push(88);
        stk.push(131);
        stk.push(30);
        System.out.println("Element in Stack:" +stk);
        result =stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}

