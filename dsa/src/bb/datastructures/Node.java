package bb.datastructures;

public class Node<T extends Comparable<T>> {
    private T content;
    private Node reference = null;

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getReference() {
        return reference;
    }

    public void setReference(Node reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}
