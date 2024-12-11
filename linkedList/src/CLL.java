public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
           do{System.out.print(temp.val+" -> ");
               temp = temp.next;
           }while (temp!=head);
        }
        System.out.println("END");
    }

    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }node = node.next;

        }while(node!=head);


    }



    public CLL(){
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;
        private Node tail;

        public Node(int value){
            this.val = value;
        }

        public Node(int value,Node next,Node tail){
            this.val = value;
            this.next = next;
            this.tail = tail;
        }
    }
}
