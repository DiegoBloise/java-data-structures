package SortedArray;

import UnsortedArray.UnsortedArray;

public class SortedArray<T> extends UnsortedArray<T> {

    public SortedArray(int capacity) {
        super(capacity);
    }

    @Override
    public void add(T element) {
        if (this.size == this.array.length || element == null) {
            return;
        }

        // TODO

        this.size++;
    }

    @Override
    public void insert(int index, T element) {
        if (index >= this.size || index < 0 || element == null) {
            return;
        }

        // TODO
    }
}
