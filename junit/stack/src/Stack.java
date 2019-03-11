public class Stack {
    private Node head;
    private int size;

    class Node {
        Object data;
        Node next;
    }

    public Stack() {
        head = null;
        size = 0;
    }

    public int size(){
        return this.size;
    }

    public void push(Object obj) {
        Node tmp = new Node();
        tmp.next = head;
        tmp.data = obj;
        size++;
        head = tmp;
    }

    public Object pop() throws Exception {
        if (head == null) {
            throw new Exception();
        }
        Object tmp = head.data;
        head = head.next;
        size--;
        return tmp;
    }
}
