import java.util.LinkedList;
import java.util.EmptyStackException;

class Gen<T> {
    private LinkedList<T> stack;

    public Gen() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.addFirst(item);
        System.out.println("Pushed: " + item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        T item = stack.removeFirst();
        System.out.println("Popped: " + item);
        return item;
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents: " + stack);
    }
}

public class P11 {
    public static void main(String[] args) {
        Gen<Integer> intStack = new Gen<>();
        System.out.println("Integer Stack Operations:");
        intStack.push(10);
        intStack.push(20);
        intStack.display();
        intStack.pop();
        intStack.display();

        System.out.println();

        Gen<Float> floatStack = new Gen<>();
        System.out.println("Float Stack Operations:");
        floatStack.push(3.14f);
        floatStack.push(6.28f);
        floatStack.display();
        floatStack.pop();
        floatStack.display();
    }
} 