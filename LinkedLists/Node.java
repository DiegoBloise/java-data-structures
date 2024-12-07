package LinkedLists;

public class Node {

	private Object data;
	private Node next;

	Node() {

	}

	Node(Object data) {
		this.data = data;
	}

	Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node node) {
		this.next = node;
	}
}