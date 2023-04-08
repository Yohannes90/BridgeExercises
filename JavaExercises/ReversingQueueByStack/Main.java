import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(767);
        queue.add(897);
        queue.add(79);
        queue.add(159);
        queue.add(174);

        System.out.println("Queue: " + queue);
        System.out.println("reversed Queue: " + reverse(queue));
    }

    static Queue<Integer> reverse (Queue<Integer> numbers) {
        Stack <Integer>stack = new Stack<Integer>();
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            stack.push(numbers.remove());
        }
        for (int i = 0; i < size; i++) {
            numbers.add(stack.pop());
        }
        return numbers;
    }
}
