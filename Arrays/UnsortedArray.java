package Arrays;

public class UnsortedArray<T> extends Array<T> {

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
}
