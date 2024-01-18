package zadanie3;
// 3. Zaimplementować kolejkę liczb rzeczywistych przy realizacji tablicowej.
public class QueueArray_main {

    public static void main(String[] args) {
        Queue_array queue = new Queue_array(3);

        queue.enQueue(10.1);
        queue.enQueue(10.3);
        queue.enQueue(10.4);

        queue.isFull();
        System.out.println(queue.isFull());

        queue.printQueue();

        System.out.println(queue.front());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
        System.out.println(queue.isEmpty());

        System.out.println(queue.front());

    }

}
