package zadanie1;

import java.util.LinkedList;

public class Stack_list {

    private LinkedList<Integer> stackList = new LinkedList<>();
    public void push(int element) {
        stackList.addLast(element);
    }

    public void peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pusty stos");
        }

        System.out.println(stackList.peekLast());
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pusty stos");
        }
        return stackList.removeLast();
    }

    public void reverseStack() {
        LinkedList<Integer> reversedStack = new LinkedList<>();

        while (!stackList.isEmpty()) {
            reversedStack.push(stackList.pop());
        }

        stackList = reversedStack;
    }

    public void printStack() {
        for (Integer integer : stackList) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }

}
