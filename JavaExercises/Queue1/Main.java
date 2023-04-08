public class Main {
    public static void main(String[] args) {
        Queue1<Integer> queue = new Queue1<>(6);

        queue.add(767);
        queue.add(897);
        queue.add(79);
        queue.add(159);
        queue.add(174);

        System.out.println("Queue: " + queue);

        System.out.println("Queue: " + queue);
        System.out.println("remove = " + queue.remove());

        System.out.println("peek = " + queue.peek());

        System.out.println("is Empty " + queue.isEmpty());

        System.out.println("to String" + queue.toString()); // Works fine with out it, maybe because it's overridden

    }
}
