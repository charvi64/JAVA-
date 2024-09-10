package week8;

public class StackTest {
    public static void main(String[] args) {
        // with Integer
        data<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        System.out.println("LinkedListStack Integer Peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack Integer Pop: " + linkedListStack.pop());
        System.out.println("   ");
        

        // ArrayStack with String
        data<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("Hello");
        arrayStack.push("World");
        System.out.println("ArrayStack String Peek: " + arrayStack.peek());
        System.out.println("ArrayStack String Pop: " + arrayStack.pop());
        System.out.println("   ");

        // with Double
        data<Double> linkedListStackDouble = new LinkedListStack<>();
        linkedListStackDouble.push(5.5);
        linkedListStackDouble.push(7.7);
        System.out.println("LinkedListStack Double Peek: " + linkedListStackDouble.peek());
        System.out.println("LinkedListStack Double Pop: " + linkedListStackDouble.pop());
        System.out.println("   ");
    }
}
