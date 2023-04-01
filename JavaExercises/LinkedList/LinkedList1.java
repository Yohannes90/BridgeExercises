public class LinkedList1 {

    private Node first;
    private Node last;
    private int  size = 0;
    public class Node {
        int value;
        Node nextNode;
        Node (int value) {
            this.value = value;
            nextNode = null;
        }
    }
    void addElement(int value) {
        Node node = new Node(value);
        if (first == null)
            first = last = null;
        else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }
    void addFirstElement(int value) {
        Node node = new Node(value);
        node.nextNode = first;
        first = node;
        size++;
    }
    void addLastElement(int value) {
        Node node = new Node(value);
        last.nextNode = node;
        last = node;
        size++;
    }
    void removeFirstElement() {
        var temp = first.nextNode;
        first.value = 0;
        first.nextNode = null;
        first = temp;
    }
    void removeLastElement() {
        var temp = first;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.nextNode;
        }
        temp.nextNode = null;
        last = temp;
        size--;
    }
    void printElements() {
        var temp = first;
        for (int i = 0; i < size - 1; i++) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }
    void toArray(){
        int[] toArray = new int[size];
        var temp = first;
        for (int i = 0; i < size - 1; i++) {
            toArray[i] = temp.value;
            temp = temp.nextNode;
        }

    }
    boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
    boolean contains(int value){
        var temp = first;
        for (int i = 0; i < size; i++) {
            if (value == temp.value)
                return true;
            temp = temp.nextNode;
        }
        return  false;
    }
    void reverse(){
        Node prev;
        Node curr = first;
        Node next;
        while (current != null) {
            next = curr.next;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
//        for (int i = 0; i < size - 1; i++) {
//            var temp = first.nextNode;
//            first.nextNode = null;
//            temp.nextNode = first;
//            first = first.nextNode;
//        }
    }
}
