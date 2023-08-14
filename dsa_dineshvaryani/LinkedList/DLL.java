package dsa_dineshvaryani.LinkedList;

public class DLL {
    // Head of list
    private Node head;

    // Doubly Linked list Node
    private class Node {
        private int data;
        private Node prev;
        private Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        public Node(int data) {
            this.data = data;
        }
    }

    public DLL() {
        this.head=null;
    }

    public void insertFirst(int val){
        Node newNode=new Node(val);
        // 3. Make next of new node as head and previous as NULL
        newNode.next = head;
        newNode.prev = null;

        // 4. change prev of head node to new node
        if (head != null)
            head.prev = newNode;

        // 5. move the head to point to the new node
        head = newNode;
    }

    public void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL dll=new DLL();

        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(6);
        dll.display();

    }
}
