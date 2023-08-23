package seminar3;

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToStart(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addToEnd(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> temp;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> node = head;
        while (node != null) {
            stringBuilder.append(node.data);
            node = node.next;
            if (node != null)
                stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
