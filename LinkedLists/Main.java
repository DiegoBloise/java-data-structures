package LinkedLists;

public class Main {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    list.addFirst(4);
    list.addFirst(5);

    list.addLast(8);

    System.out.println("-".repeat(42));

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    list.add(5, 42);

    System.out.println("-".repeat(42));

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("-".repeat(42));

    System.out.println(list.get(-1));
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(4));
    System.out.println(list.get(5));
    System.out.println(list.get(6));
    System.out.println(list.get(7));

    System.out.println("-".repeat(42));

    System.out.println(list.contains(-2));
    System.out.println(list.contains(0));
    System.out.println(list.contains(1));
    System.out.println(list.contains(3));
    System.out.println(list.contains(5));
    System.out.println(list.contains(8));
    System.out.println(list.contains(9));

    System.out.println("-".repeat(42));

    list.remove(4);

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("-".repeat(42));

    list.removeLast();
    list.removeFirst();
    list.remove(1);

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("-".repeat(42));

    list.clear();
    list.remove(5);
    list.remove(-1);
    list.remove(0);
    list.removeFirst();
    list.removeLast();

    System.out.println("Size: " + list.size());
    System.out.println(list.toString());

    System.out.println("-".repeat(42));
  }
}
