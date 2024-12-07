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

    System.out.println("--------------");

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("--------------");

    System.out.println(list.get(-1));
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(4));
    System.out.println(list.get(5));
    System.out.println(list.get(6));

    System.out.println("--------------");

    System.out.println(list.contains(-2));
    System.out.println(list.contains(0));
    System.out.println(list.contains(1));
    System.out.println(list.contains(3));
    System.out.println(list.contains(5));
    System.out.println(list.contains(8));
    System.out.println(list.contains(9));
    System.out.println(list.contains("c"));

    System.out.println("--------------");

    list.remove(4);
    list.clear();

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("--------------");

    // list.removeLast();
    // list.removeFirst();

    // System.out.println("Size: " + list.size());
    // System.out.println(list.toString());
  }
}
