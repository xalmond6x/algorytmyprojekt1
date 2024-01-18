package zadanie4;
// 4. Zaimpementować kolejkę napisów (ciągi cyfr, dużych i małych liter) przy realizacji listowej. Opracować algorytm, który nie zmieniając struk tury kolejki wyszukuje w tej kolejce zadany element.
public class QueueList_main {

    public static void main(String[] args)
    {
        Queue_list queue = new Queue_list();

        queue.enQueue("2");
        queue.enQueue("Napis");
        queue.enQueue("DUZEZNAKImaleznaki8679");

        System.out.println(queue.searchElement("3"));

        System.out.println("Element z początku kolejki: " + queue.front());

        System.out.println("Kolejka przed usunięciem:");
        queue.printQueue();

        String removedElement = queue.deQueue();
        System.out.println("Usunięty element: " + removedElement);

        System.out.println("Kolejka po usunięciu:");
        queue.printQueue();
    }

}
