Public class Stack<T> {
    private T[] elements;
    private int top;

    public Stack() {
        elements = (T[]) new Object[10];
        top = -1;
    }

    public void push(T element) {
        elements[++top] = element;
    }

    public T pop() {
        return elements[top--];
    }

    public T peak() {
        //insert your code here
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
