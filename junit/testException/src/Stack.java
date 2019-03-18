public class Stack {
    private Node head;
    private int size;
    private int max_size;

    class Node {
        Object data;
        Node next;
    }

    public Stack(int max_size) {
        head = null;
        size = 0;
        this.max_size = max_size;
    }

    public Stack() {
        this(10);
    }

    public int size() {
        return this.size;
    }

    public void push(Object obj) throws FullStackException {
        if (size >= max_size) {
            throw new FullStackException("Push a full stack");
        }
        Node tmp = new Node();
        tmp.next = head;
        tmp.data = obj;
        size++;
        head = tmp;
    }

    public Object pop() throws EmptyStackException {
        if (head == null) {
            throw new EmptyStackException("Pop an empty stack");
        }
        Object tmp = head.data;
        head = head.next;
        size--;
        return tmp;
    }
}
