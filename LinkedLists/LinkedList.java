package LinkedLists;

import java.util.Objects;

public class LinkedList<T> {

    private Node<T> head;
    private int size = 0;

    public void addLast(T item) {
        if (this.head == null) {
            this.head = new Node<>(item);
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<>(item));
        }
        this.size++;
    }

    public void addLastRecursive(T item) {
        if (this.head == null) {
            this.head = new Node<>(item);
        } else {
            setTail(this.head, item);
        }
        this.size++;
    }

    public void addFirst(T item) {
        this.head = new Node<>(item, this.head);
        this.size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > this.size()) {
            return;
        }

        if (index == this.size()) {
            this.addLast(item);
            return;
        }

        if (index == 0 || this.head == null) {
            this.addFirst(item);
            return;
        }

        int count = 0;
        Node<T> current = this.head;

        while (current != null) {
            if (count == index - 1) {
                current.setNext(new Node<>(item, current.getNext()));
                this.size++;
                return;
            }
            current = current.getNext();
            count++;
        }
    }

    public void removeLast() {
        if (this.head == null) {
            return;
        }

        if (this.head.getNext() == null) {
            this.head = null;
            this.size--;
            return;
        }

        Node<T> current = this.head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        this.size--;
    }

    public void removeFirst() {
        if (this.head == null) {
            return;
        }

        if (this.head.getNext() != null) {
            this.head = this.head.getNext();
        } else {
            this.head = null;
        }

        this.size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size() || this.head == null) {
            return;
        }

        if (index == 0) {
            this.removeFirst();
            return;
        }

        int count = 0;
        Node<T> current = this.head;

        while (current.getNext() != null) {
            if (count == index - 1) {
                current.setNext(current.getNext().getNext());
                this.size--;
                return;
            }
            current = current.getNext();
            count++;
        }
    }

    public boolean contains(T item) {
        Node<T> current = this.head;
        while (current != null) {
            if (Objects.equals(current.getData(), item)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size() || this.head == null) {
            return null;
        }

        int count = 0;

        Node<T> current = this.head;
        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            current = current.getNext();
            count++;
        }

        return null;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    private void setTail(Node<T> node, T item) {
        if (node.getNext() != null) {
            setTail(node.getNext(), item);
            return;
        }
        node.setNext(new Node<>(item));
    }

    public String toString() {
        if (this.head == null) {
            return "Empty list.";
        }

        StringBuilder str = new StringBuilder();

        Node<T> current = this.head;
        while (current != null) {
            str.append(current.getData());
            if (current.getNext() != null) {
                str.append(" -> ");
            }
            current = current.getNext();
        }

        return str.toString();
    }
}