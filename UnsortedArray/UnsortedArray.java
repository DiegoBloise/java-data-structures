package UnsortedArray;

public class UnsortedArray<T> {

    protected T[] array;
    protected int size;

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

    public void insert(int index, T element) {
        if (index >= this.size || index < 0 || element == null) {
            return;
        }

        this.array[index] = element;
    }

    public void removeAt(int index) {
        if (index >= this.size || index < 0) {
            return;
        }

        this.array[index] = null;
        this.size--;
        this.reArrange();
    }

    public void remove(T element) {
        if (element == null) {
            return;
        }

        int index = this.find(element);

        if (index < 0) {
            return;
        }

        this.array[index] = null;
        this.size--;
        this.reArrange();
    }

    public void swap(T firstElement, T secondElement) {
        if (firstElement == null || secondElement == null) {
            return;
        }

        int firstElementIndex = this.find(firstElement);
        int secondElementIndex = this.find(secondElement);

        if (firstElementIndex < 0 || secondElementIndex < 0) {
            return;
        }

        T temp = this.array[firstElementIndex];
        this.array[firstElementIndex] = this.array[secondElementIndex];
        this.array[secondElementIndex] = temp;
    }

    public int find(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }

        return this.array[index];
    }

    private void reArrange() {
        for (int i = 1; i < this.array.length; i++) {
            if (this.array[i - 1] == null) {
                this.array[i - 1] = this.array[i];
            }
        }
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
