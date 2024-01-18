package zadanie1;
// 1. Zaimplementować stos liczb całkowitych przy realizacji listowej. Opra cować algorytm, który w oparciu o podstawowe operacje stosowe od wróci porządek elementów na stosie.
public class StackList_main {


    public static void main(String[] args) {
        Stack_list stackList = new Stack_list();

        stackList.push(1);
        stackList.push(6);
        stackList.push(5);
        stackList.push(4);


        stackList.printStack();
        stackList.peek();

        stackList.reverseStack();
        stackList.printStack();
        stackList.peek();

        stackList.pop();
        stackList.peek();


    }
}
