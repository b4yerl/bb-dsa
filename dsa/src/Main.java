import bb.datastructures.Node;
import bb.datastructures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(new Node<Integer>(5));
        myStack.push(new Node<Integer>(6));
        myStack.push(new Node<Integer>(7));
        myStack.push(new Node<Integer>(8));

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);
        System.out.println(myStack.size());
    }
}