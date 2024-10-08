package maxmin;

public interface MaxMin<T extends Comparable<T>> {
    T findMax(T[] array);
    T findMin(T[] array);
}