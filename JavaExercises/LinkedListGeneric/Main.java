public class Main {
    public static void main(String[] args) {
        GenericLinkedList1<Integer>  numbers = new GenericLinkedList1();
        numbers.addElement(121);
        numbers.addElement(242);
        numbers.addElement(787);
        numbers.addElement(192);
        numbers.printElements();

        numbers.toArray();
    }
}
