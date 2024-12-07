package LinkedList;
public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.addItem(1);
    list.addItem(2);
    list.addItem(3);

    System.out.println(list.print());
  }

  public static class Node {

    private Integer number;
    private Node next;

    Node(){

    }

    Node(Integer n){
      this.number = n;
    }

    public Integer getNumber() {
      return number;
    }

    public void setNumber(Integer n) {
      this.number = n;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node node) {
      this.next = node;
    }
  }

  public static class LinkedList {

    private Node head;

    public void addItem(Integer item) {
      if (this.head == null) {
        this.head = new Node(item);
        return;
      }

      setTail(this.head, item);
    }

    private void setTail(Node node, Integer item) {
      if (node.getNext() != null) {
        setTail(node.getNext(), item);
        return;
      }

      node.setNext(new Node(item));
    }

    public String print() {
      if (this.head == null) {
        return "Empty list.";
      }

      StringBuilder str = new StringBuilder();
      Node current = this.head;

      while (current != null) {
        str.append(current.getNumber());
        if (current.getNext() != null) {
          str.append(" -> ");
        }
        current = current.getNext();
      }

      return str.toString();
    }
  }
}
