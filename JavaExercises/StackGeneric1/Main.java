public class Main {
    public static void main(String[] args) {
        GenericStack1<Integer> stack = new GenericStack1<>();

        stack.push(767);
        stack.push(897);
        stack.push(97);
        stack.push(82);
        stack.push(100);

        stack.printStack();

        System.out.println("pop = " + stack.pop());
        stack.printStack();

        System.out.println("peek = " + stack.peek());
        stack.printStack();

        System.out.println("is Empty " + stack.isEmpty());
    }
}
