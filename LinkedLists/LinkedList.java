package LinkedLists;

public class LinkedList {

	private Node head;

	public void addLast(Object item) {
		if (this.head == null) {
			this.head = new Node(item);
			return;
		}

		Node current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node(item));
	}

	public void addLastRecursive(Object item) {
		if (this.head == null) {
			this.head = new Node(item);
			return;
		}

		setTail(this.head, item);
	}

	public void addFirst(Object item) {
		this.head = new Node(item, this.head);
	}

	public void add(Integer index, Object item) {

	}

	public void removeLast() {
		if (this.head == null) {
			return;
		}

		if (this.head.getNext() == null) {
			this.head = null;
			return;
		}

		Node current = this.head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}

		current.setNext(null);
	}

	public void removeFirst() {

	}

	public void remove(Integer index) {

	}

	public Boolean contains(Object item) {
		return false;
	}

	public Object get(Integer index) {
		return null;
	}

	public Integer size() {
		Integer count = 0;

		if (this.head == null) {
			return count;
		}

		count++;

		Node current = this.head;
		while (current.getNext() != null) {
			current = current.getNext();
			count++;
		}

		return count;
	}

	public void clear() {

	}

	private void setTail(Node node, Object item) {
		if (node.getNext() != null) {
			setTail(node.getNext(), item);
			return;
		}

		node.setNext(new Node(item));
	}

	public String toString() {
		if (this.head == null) {
			return "Empty list.";
		}

		StringBuilder str = new StringBuilder();

		Node current = this.head;
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