public class GenericLinkedList1<T> {

    private Node first;
    private Node last;
    private int  size = 0;

    public class Node<T> {
        T item;
        Node nextNode;
        Node (T item) {
            this.item = item;
            nextNode = null;
        }
    }

    void addElement(T value) {
        Node node = new Node(value);
        if (first == null)
            first = last = null;
        else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }

    void addFirstElement(T value) {
        Node node = new Node(value);
        node.nextNode = first;
        first = node;
        size++;
    }

    void addLastElement(T value) {
        Node node = new Node(value);
        last.nextNode = node;
        last = node;
        size++;
    }

    void removeFirstElement() {
        Node temp = first.nextNode;
        first = temp;
        size--;
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
        for (int i = 0; i < size; i++) {
            System.out.println(temp.item);
            temp = temp.nextNode;
        }
    }

    void toArray(){
        T[] toArray = (T[]) new Object[size];
        var temp = first;
        for (int i = 0; i < size; i++) {
            toArray[i] = (T) temp.item;
            temp = temp.nextNode;
        }
    }

    boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    boolean contains(T value){
        var temp = first;
        for (int i = 0; i < size; i++) {
            if (value == temp.item)
                return true;
            temp = temp.nextNode;
        }
        return  false;
    }

    void reverse() {
        Node prev = null;
        Node curr = first;
        Node next = null;
        while (curr != null) {
            next = curr.nextNode;
            curr.nextNode = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
    }
}
