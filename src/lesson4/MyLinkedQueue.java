package lesson4;

import java.util.EmptyStackException;

public class MyLinkedQueue<T> {

    MyLinkedList<T> queue = new MyLinkedList<>();

    public void insert(T item) {
        if (queue.isEmpty()) queue.insertFirst(item);
        else queue.insertLast(item);
    }

    public T remove() {
        return queue.deleteFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
