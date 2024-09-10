package week8;


public class ArrayStack<T> implements data<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public void push(T element) {
        if (size == array.length) {
            throw new StackOverflowError("Stack is full");
        }
        array[size++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = array[--size];
        array[size] = null; 
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
