package bb.datastructures;

public class Stack {
    private Node entryPoint;

    public Stack() {
        entryPoint = null;
    }

    public Node top() {
        return entryPoint;
    }
    public void push(Node newNode) {
        if(!this.isEmpty()) {
            newNode.setReference(entryPoint);
        }
        entryPoint = newNode;
    }
    public Node pop() {
        Node tempNode = entryPoint;
        entryPoint = entryPoint.getReference();
        return tempNode;
    }

    public boolean isEmpty() {
        return entryPoint == null;
    }

    public int size() {
        int counter = 0;
        Node current = entryPoint;

        while(current != null) {
            counter++;
            current = current.getReference();
        }

        return counter;
    }

    @Override
    public String toString() {
        String returnString = "STACK\n---------------\n";

        Node tempNode = entryPoint;
        while(tempNode != null) {
            returnString += tempNode.getContent();
            returnString += "\n";
            tempNode = tempNode.getReference();
        }
        return returnString;
    }
}
