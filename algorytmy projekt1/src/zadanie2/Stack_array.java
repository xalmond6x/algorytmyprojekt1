package zadanie2;

public class Stack_array {
    private int[] stackArray;
    private int top;
    protected int capacity;

    public Stack_array(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stos pełny. Nie można dodać elementów.");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pusty stos.");
            return -1;
        }
        return stackArray[top--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Pusty stos.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void mergeSortedStacks(Stack_array stackA, Stack_array stackB) {
        Stack_array tempStack = new Stack_array(stackA.capacity + stackB.capacity);

        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            if (stackA.top() < stackB.top()) {
                tempStack.push(stackA.pop());
            } else {
                tempStack.push(stackB.pop());
            }
        }

        while (!stackA.isEmpty()) {
            tempStack.push(stackA.pop());
        }

        while (!stackB.isEmpty()) {
            tempStack.push(stackB.pop());
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
