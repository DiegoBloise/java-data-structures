package LinkedLists;

public class LinkedList<T> {

	private Node<T> head;

	public void addLast(T item) {
		if (this.head == null) {
			this.head = new Node<>(item);
			return;
		}

		Node<T> current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node<>(item));
	}

	public void addLastRecursive(T item) {
		if (this.head == null) {
			this.head = new Node<>(item);
			return;
		}

		setTail(this.head, item);
	}

	public void addFirst(T item) {
		this.head = new Node<>(item, this.head);
	}

	public void add(int index, T item) {

	}

	public void removeLast() {
		if (this.head == null) {
			return;
		}

		if (this.head.getNext() == null) {
			this.head = null;
			return;
		}

		Node<T> current = this.head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}

		current.setNext(null);
	}

	public void removeFirst() {
		if (this.head == null) {
			return;
		}

		if (this.head.getNext() != null) {
			this.head = this.head.getNext();
			return;
		}

		this.head = null;
	}

	public void remove(int index) {
		if (index < 0 || this.head == null) {
			return;
		}

		if (index == 0) {
			this.head = this.head.getNext();
			return;
		}

		int count = 0;
		Node<T> current = this.head;

		while (current.getNext() != null) {
			if (count == index - 1) {
				if (current.getNext().getNext() == null) {
					current.setNext(null);
				} else {
					current.setNext(current.getNext().getNext());
				}
				return;
			}
			current = current.getNext();
			count++;
		}
	}

	public boolean contains(T item) {
		Node<T> current = this.head;
		while (current != null) {
			if (current.getData().equals(item)) {
				return true;
			}
			current = current.getNext();
		}

		return false;
	}

	public T get(int index) {
		if (index < 0 || this.head == null) {
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
		int count = 0;

		if (this.head == null) {
			return count;
		}

		count++;

		Node<T> current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
			count++;
		}

		return count;
	}

	public void clear() {
		this.head = null;
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