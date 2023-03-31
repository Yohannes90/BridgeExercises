public class Mainn {
    public static void main(String[] args) {
        ArrayList1 numbers = new ArrayList1(4);
        numbers.addElement(45);
        numbers.addElement(4);
        numbers.addElement(456);
        numbers.addElement(5);
        numbers.printElements();

        numbers.addElement(78);
        numbers.addElement(685);
        numbers.printElements();

        numbers.deleteElement(3);
        numbers.printElements();

        numbers.updateElement(1, 34222);
        numbers.printElements();

        numbers.insertElement(5, 3420);
        numbers.printElements();
        System.out.println(numbers.size());
        System.out.println("element at index 4 is " + numbers.indexOf(4));
        System.out.println("element at index 3 is " + numbers.indexOf(3));
    }
}
