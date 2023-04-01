import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericLinkedList1<Integer>  numbers = new GenericLinkedList1();
        numbers.addElement(121);
        numbers.addElement(242);
        numbers.addElement(787);
        numbers.addElement(192);
        numbers.printElements();

        System.out.println(Arrays.toString(numbers.toArray()));
        numbers.addFirstElement(1000);

        numbers.printElements();
        System.out.println(Arrays.toString(numbers.toArray()));

        numbers.addLastElement(8000);
        numbers.printElements();

        System.out.println("is empty? " + numbers.isEmpty());

        System.out.println("contains 8000? " + numbers.contains(8000));
        System.out.println("contains 80? " + numbers.contains(80));

        numbers.removeFirstElement();
        System.out.println(Arrays.toString(numbers.toArray()));

        numbers.removeLastElement();
        System.out.println(Arrays.toString(numbers.toArray()));

        numbers.reverse();
        System.out.println(Arrays.toString(numbers.toArray()));

    }
}
