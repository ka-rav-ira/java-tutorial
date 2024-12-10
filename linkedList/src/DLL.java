public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.head = null;
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head; // Point new node's next to current head
        node.prev = null; // New node's previous is null

        if (head != null) {
            head.prev = node; // Update current head's previous to new node
        }

        head = node; // Update head to new node
        size++; // Increment size
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}