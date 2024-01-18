package zadanie2;
// 2. Zaimplementować stos liczb całkowitych przy realizacji tablicowej. Opra cować algorytm scalający dwa uporządkowane rosnąco ciągi A i B liczb całkowitych umieszczone odpowiednio na stosach stosA i stosB.
// Ciąg wynikowy umieścić na stosie stosC.
public class StackArray_main {

    public static void main(String[] args) {
        Stack_array stackA = new Stack_array(5);
        Stack_array stackB = new Stack_array(5);

        stackA.push(2);
        stackA.push(8);
        stackA.push(5);
        stackA.push(4);
        stackA.push(2);
        stackA.push(9);

        stackB.push(1);
        stackB.push(6);
        stackB.push(3);

        System.out.println(stackA.top());
        System.out.println(stackB.top());

        System.out.println("Stos A:");
        stackA.printStack();

        System.out.println("Stos B:");
        stackB.printStack();

        Stack_array stackC = new Stack_array(stackA.capacity + stackB.capacity);
        stackC.mergeSortedStacks(stackA, stackB);

        System.out.println("Scalony stos C:");
        stackC.printStack();
    }

}
