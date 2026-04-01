
import LinkedLists.LinkedList;
import UnsortedArray.UnsortedArray;

public class Main {

    public static void main(String[] args) {
        unsortedArrayTests();
    }

    public static void unsortedArrayTests() {
        UnsortedArray<Integer> unsortedArray = new UnsortedArray<>(5);

        unsortedArray.add(2);
        unsortedArray.add(null);
        unsortedArray.add(8);
        unsortedArray.add(9);
        unsortedArray.add(99);
        unsortedArray.add(99);

        unsortedArray.add(null);

        System.out.println("\nArray..........: " + unsortedArray.toString());
        System.out.println("Array size.....: " + unsortedArray.size());
        System.out.println("Array capacity.: " + unsortedArray.capacity());

        System.out.println("\n");

        Integer element = 995;
        System.out.println("Find Element " + element + ": index -> " + unsortedArray.find(element));

        System.out.println("\nFind by index:");

        int idx1 = 5;
        int idx2 = -1;
        int idx3 = 2;
        System.out.println("Invalid index (" + idx1 + ")..: " + unsortedArray.get(idx1));
        System.out.println("Invalid index (" + idx2 + ").: " + unsortedArray.get(idx2));
        System.out.println("Valid index (" + idx3 + ")....: " + unsortedArray.get(idx3));

        System.out.println("\nRemoving elements:");
        System.out.println("Array......: " + unsortedArray.toString());
        Integer validElement = unsortedArray.get(2);
        Integer invalidElement = 895;

        unsortedArray.remove(validElement);
        System.out.println("Remove " + validElement + "...: " + unsortedArray.toString());

        unsortedArray.remove(invalidElement);
        System.out.println("Remove " + invalidElement + ".: " + unsortedArray.toString());

        System.out.println("\nRemove by index:");

        int invalidIndex1 = unsortedArray.size();
        int invalidIndex2 = -1;
        int validIndex = 1;

        unsortedArray.removeAt(invalidIndex1);
        System.out.println("Invalid index (" + invalidIndex1 + ")..: " + unsortedArray.toString());

        unsortedArray.removeAt(invalidIndex2);
        System.out.println("Invalid index (" + invalidIndex2 + ").: " + unsortedArray.toString());

        unsortedArray.removeAt(validIndex);
        System.out.println("Valid index (" + validIndex + ")....: " + unsortedArray.toString());
    }

    public static void linkedListTests() {
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
