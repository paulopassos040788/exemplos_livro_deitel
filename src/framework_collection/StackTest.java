package framework_collection;

import java.util.EmptyStackException;
import java.util.Stack;

// Figura 16.14: StackTest.java
// classe Stack do pacote java.util.
public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(12L); // insere o valor long 12Lÿ
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567); // insere o valor int 34567ÿ
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F); // insere o valor float 1.0Fÿ
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678); // insere o valor double 1234.5678ÿ
        System.out.println("Pushed 1234.5678 ");
        printStack(stack);

        try {
            Number removedObject = null;

            while (true){
                removedObject = stack.pop();
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty()) {
            System.out.printf("stack is empty%n%n");
        } else {
            System.out.printf("stack contains: %s (top)%n", stack);
        }
    }
}
