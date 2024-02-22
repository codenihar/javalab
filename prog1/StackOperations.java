import java.util.*;

class StackOperations {
    private static final int MAX_SIZE = 10;
    private int top = -1;
    private int[] stack = new int[MAX_SIZE];

    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackOperations stack = new StackOperations();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
