import java.util.Arrays;

Public class GenericStack1<T> {
    private T[] elements;
    private int top;

    public GenericStack1() {
        elements = (T[]) new Object[10];
        top = -1;
    }

    public void push(T element) {
        elements[++top] = element;
    }

    public T pop() {
        return elements[top--];
    }

    public T peek() {
        //insert your code here
        if (top > 0) {
            T value = elements[top];
            return value;
        }
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.println(Arrays.toString(elements));
    }
}
