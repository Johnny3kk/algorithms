package lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        if (isEmpty()) {
            list[begin] = item;
            begin = nextIndexInLeft(begin);
        } else {
            begin = nextIndexInLeft(begin);
            list[begin] = item;
        }
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[end] = item;
        end = nextIndexInRight(end);
    }

    public T removeLeft() {
        T value = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndexInRight(begin);
        return value;
    }

    public T removeRight() {
        T value = peekRight();
        size--;
        end = nextIndexInLeft(end);
        list[end] = null;
        return value;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end - 1];
    }


    private int nextIndexInRight(int index) {
        return (index + 1) % list.length;
    }
    private  int nextIndexInLeft(int index) {
        if ((index - 1) < 0) return (list.length - 1);
        else return index - 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            int i = begin;
            while (i != end) {
                sb.append(list[i]).append(", ");
                i = nextIndexInRight(i);
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

}
