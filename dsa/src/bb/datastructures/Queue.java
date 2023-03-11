package bb.datastructures;

public class Queue {
    private Node entryPoint;

    public Queue() {
        this.entryPoint = null;
    }

    public int size() {
        int counter = 0;
        Node currentNode = entryPoint;
        while(currentNode.getReference() != null) {
            counter++;
            currentNode = currentNode.getReference();
        }
        return counter;
    }

    public void enqueue(Node newNode) {
        if(this.isEmpty()) {
            entryPoint = newNode;
        }
        else {
            Node lastInLine = entryPoint;
            for(int i = 0; i < this.size(); i++) {
                lastInLine = lastInLine.getReference();
            }
            lastInLine.setReference(newNode);
        }
    }

    public Node dequeue() {
        Node removedNode = entryPoint;
        entryPoint = entryPoint.getReference();

        return removedNode;
    }

    public Node getFirst() {
        return this.entryPoint;
    }

    public boolean isEmpty() {
        return entryPoint == null;
    }

    @Override
    public String toString() {
        String returnString = "QUEUE\n---------------\n";

        Node tempNode = entryPoint;
        while(tempNode != null) {
            returnString += tempNode.getContent();
            returnString += "\n";
            tempNode = tempNode.getReference();
        }
        return returnString;
    }
}
