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
        // Why do we have to change the value of first,
        // won't it work if we just break reference so that the garbage collection can take care of it.
    }
    void removeLastElement() {
        var temp = first;
        for (int i = 0; i < size; i++) {
            temp = temp.nextNode;
            if (i == size - 1) {
                temp.nextNode = null;
            }
        }
        size--;
    }
    void printElements() {
        var temp = first;
        for (int i = 0; i < size-1; i++) {
            System.out.println(temp.value);
            temp = temp.nextNode;
        }
    }
    void toArray(){
        int[] toArray = new int[size];
        var temp = first;
        for (int i = 0; i < size; i++) {
            toArray[i] = temp.value;
            temp = temp.nextNode;
        }

    }
    boolean isEmpty() {
        //check if the linked list is empty and return boolean value
        if (size == 0)
            return true;
        return false;
    }
    boolean contains(int value){
        //check if the linked list contains the value and return boolean value if there are elements
        var temp = first;
        for (int i = 0; i < size; i++) {
            if (value == temp.value)
                return true;
            temp = temp.nextNode;
        }
        return  false;
    }
    void reverse(){
        //reverse the linked list
        for (int i = 0; i < size - 1; i++) {
            var temp = first.nextNode;
            if (i == 0)
                first.nextNode = null;
            else
                first = temp;

        }
    }
}
