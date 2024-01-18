package zadanie4;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_list {

    private Queue<String> queue;


    public Queue_list() {
        queue = new LinkedList<>();
    }

    public boolean enQueue(String element){
        return queue.add(element);
    }

    public String deQueue()
    {
        if(empty()){
            throw new IllegalStateException("Pusta kolejka");
        }
        return queue.poll();
    }

    public String front(){
        return queue.element();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public void printQueue(){
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public String searchElement(String element){
        if(empty()){
            throw new IllegalStateException("Pusta kolejka, nie można wyszukać");
        }

        else if (queue.contains(element)){
            return "Kolejka zawiera element: " + element;
        }

        return "Brak elementu " + element;
    }
}

