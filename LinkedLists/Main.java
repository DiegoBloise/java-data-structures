package LinkedLists;

public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    list.addFirst(4);
    list.addFirst(5);

    list.addLast(8);

    System.out.println(list.toString());
  }
}
