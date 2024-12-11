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
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int val){

        Node p = find(after);
        if(p==null){
            System.out.println("Does Not Exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next.prev!=null){
            node.next.prev = node;
        }



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