package UnsortedArray;

public class UnsortedArray<T> {

    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public UnsortedArray(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T element) {
        if (this.size == this.array.length || element == null) {
            return;
        }

        this.array[size] = element;
        this.size++;
    }

    public void insert(int index) {

    }

    public void removeAt(int index) {

    }

    public void remove(T element) {

    }

    public void swap(T firstElement, T secondElement) {

    }

    public int find(T element) {
        return 0;
    }

    private void reArrange() {

    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.array.length;
    }

    public String toString() {
        if (this.size == 0) {
            return "Empty list.";
        }

        StringBuilder str = new StringBuilder();

        str.append("[");
        for (int i = 0; i < this.size; i++) {
            str.append(this.array[i]);
            if (i != this.size - 1) {
                str.append(", ");
            }
        }
        str.append("]");

        return str.toString();
    }
}
