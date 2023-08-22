package seminar3;

public class DoubleLinkedList {

    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToStart(T data) {
        Node<T> node = new Node<T>(data);
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
        Node<T> node = new Node<T>(data);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }


    class Node<T> {
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
