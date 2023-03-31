public class Main {
    public static void main(String[] args) {
        GenericArrayList1<Integer> numbers = new GenericArrayList1(4);
        numbers.addElement(323);
        numbers.addElement(152);
        numbers.addElement(645);
        numbers.addElement(433);
        numbers.printElements();

        numbers.addElement(231);
        numbers.addElement(843);
        numbers.printElements();

        numbers.deleteElement(4);
        numbers.printElements();

        numbers.updateElement(2, 54332);
        numbers.printElements();

        numbers.insertElement(3, 200000);
        numbers.printElements();

        System.out.println("size of numbers is " + numbers.size());
        System.out.println("The element at index 4 is " + numbers.indexOf(4));
        System.out.println("The element at index 3 is " + numbers.indexOf(3));
    }
}
