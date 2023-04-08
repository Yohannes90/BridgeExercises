import java.util.Arrays;
import java.util.NoSuchElementException;

public class GenericQueue1<T> {
    int capacity;
    T[]storage;
    int front =0;
    int back = 0;
    int count = 0;

    public GenericQueue1(int capacity) {
        this.capacity = capacity;
        storage = (T[]) new Object[capacity];
    }

    /**
     * add - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity
     * restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
     * @param value: the element to add
     *
     * @throws: IllegalStateException - if the element cannot be added at this time due to capacity restrictions
     */
    void add(T value){
        // This methode is similar to offer() only differ in the exception it throws
        if((capacity-1) >= count ) {
            storage[front] = value;
            front = (front +1) % capacity;
            count++;
        }
        else
            throw new IllegalStateException("ምን አስበህ ነዉ");
    }

    /**
     * remove - Retrieves and removes the head of this queue, or returns null if this queue is empty.
     *
     * @return: the head of this queue
     * @throws: NoSuchElementException – if this queue is empty
     */
    T remove(){
        // This method differs from poll() only in that it throws an exception if this queue is empty.
        if(count > 0) {
            T value = storage[back];
            storage[back] = null;
            back = (back+1) % capacity;
            count--;
            return value;
        }
        throw new NoSuchElementException("Queue is empty");
    }

    /**
     * peek - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return: the head of this queue, or null if this queue is empty
     */
    T peek(){
        //This method differs from element() only in that it doesn't throw an exception if this queue is empty.
        if (count > 0) {
            T value = storage[back];
            return value;
        }
        return null;
    }

    boolean isEmpty(){
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(storage);
    }

}
