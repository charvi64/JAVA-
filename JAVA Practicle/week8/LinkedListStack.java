package week8;

import java.util.LinkedList;

public class LinkedListStack<T> implements data<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }

    @Override
    public T peek() {
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
