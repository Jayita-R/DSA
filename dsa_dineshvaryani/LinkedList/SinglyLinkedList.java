package dsa_dineshvaryani.LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public void insertAtBegin(int val){
        ListNode node=new ListNode(val);
        node.next=head;
        head=node;
    }

    public void insertAtEnd(int val){
        ListNode node=new ListNode(val);
        if(head==null){
            head=node;
            return;
        }
        ListNode prev=head;
        while(prev.next!=null){
            prev=prev.next;
        }
        prev.next=node;

    }

    public void insert(int pos,int val){
        ListNode node=new ListNode(val);
        if(pos==1){
            node.next=head;
            head=node;
        }else{
            ListNode prev=head;
            int cnt=1;
            while(cnt<pos-1){
                prev=prev.next;
                cnt++;
            }
            ListNode current=prev.next;
            prev.next=node;
            node.next=current;
        }
    }

    public ListNode deleteAtBegin(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        head=head.next;
        current.next=null;
        return current;
    }

    public ListNode deleteAtEnd(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
        return current;
    }

    public void delete(int pos){
        if(pos==1){
            head=head.next;
        }else{
            ListNode current=head;
            int cnt=1;
            while(cnt<pos-1){
                ++cnt;
                current=current.next;
            }
            ListNode node=current.next;
            current.next=node.next;
            node.next=null;

        }

    }

    public boolean searchElement(int searchKey){
        if(head==null) return false;
        ListNode current=head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public ListNode reverse(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while (current != null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        return prev;
    }

    public ListNode middleNode(){
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode getNthNodeFromEnd(int n){
        if(head==null) return null;
        if(n<=0){
            throw new IllegalArgumentException("Invalid value: n="+n);
        }
        ListNode mainPtr=head;
        ListNode refPtr=head;
        int cnt=0;
        while(cnt<n){
            if(refPtr==null){
                throw new IllegalArgumentException(n+"is greater than the number of nodes in list");
            }
            refPtr=refPtr.next;
            cnt++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr;
    }

    public void removeDuplicates(){
        if(head==null) return;
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
    }

    public ListNode insertInSortedList(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            return newNode;
        }
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;

        return head;
    }

    public void deleteNode(int key){
        ListNode current=head;
        ListNode temp=null;
        if(current!=null && current.data==key){
            head=current.next;
            return;
        }

        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null) return;
        temp.next=current.next;
    }

    public boolean containsLoop(){
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
                return true;
            }
        }
        return false;
    }

    public ListNode startOfLoop(){
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp=head;
        while(slowPtr!=temp){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        return temp;
    }

    public void removeOfLoop(){
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(slowPtr==fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode temp=head;
        while(slowPtr.next!=temp.next){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=null;
    }

    public void createALoopInLL(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);
        ListNode sixth=new ListNode(6);

        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
    }

    public static ListNode merge(ListNode a,ListNode b){
        //ListNode dummy=new ListNode(0);
        ListNode head=null;
        if(a.data<=b.data){
            head=a;
            a=a.next;
        }else{
            head=b;
            b=b.next;
        }
        //ListNode tail=dummy;
        ListNode tail=head;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }else{
            tail.next=a;
        }
        return head;
    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head==null) return 0;
        int cnt=0;
        ListNode current=head;
        while(current!=null){
            ++cnt;
            current=current.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        /*sll.head=new ListNode(10);
        ListNode s=new ListNode(8);
        ListNode t=new ListNode(1);
        ListNode f=new ListNode(16);

        //now we will connect them together
        sll.head.next=s;
        s.next=t;
        t.next=f;*/

        sll.insertAtEnd(1);
        sll.insertAtEnd(4);
        sll.insertAtEnd(8);


        SinglyLinkedList sll1=new SinglyLinkedList();
        sll1.insertAtEnd(2);
        sll1.insertAtEnd(5);
        sll1.insertAtEnd(7);
        sll1.insertAtEnd(9);
        sll1.insertAtEnd(14);
        sll1.insertAtEnd(18);

        sll.display();
        sll1.display();

        SinglyLinkedList result=new SinglyLinkedList();
        result.head=merge(sll.head,sll1.head);
        result.display();


        //sll.insertAtBegin(1);
        //sll.display();

        /*sll.insertAtEnd(5);
        sll.insertAtEnd(6);
        sll.insertAtEnd(7);*/

        /*sll.insert(1,6);
        sll.insert(1,5);
        sll.insert(2,7);
        sll.insert(3,8);
        sll.insert(5,11);


        sll.display(sll.head);*/

        //System.out.println(sll.deleteAtBegin().data);
        //System.out.println(sll.deleteAtEnd().data);
        //System.out.println(sll.deleteAtEnd().data);
        /*sll.delete(2);
        sll.delete(3);

        sll.display();*/
        /*boolean ans= sll.searchElement(7);
        if(ans==true){
            System.out.println("Key found!!");
        }else{
            System.out.println("Key not found!!");
        }*/

        //ListNode revNodes=sll.reverse();
        //sll.display(revNodes);

        //ListNode middleNode=sll.middleNode();
        //System.out.println("Middle Node is - "+ middleNode.data);

        //ListNode mainPtr=sll.getNthNodeFromEnd(3);
        //System.out.println("Nth node is "+mainPtr.data);

        //sll.removeDuplicates();

        //sll.insertInSortedList(11);
        //sll.deleteNode(10);
        //sll.display();

        //sll.createALoopInLL();
        //System.out.println(sll.containsLoop());

        //sll.createALoopInLL();
        //sll.removeOfLoop();
        //sll.display();
        //System.out.println(sll.startOfLoop().data);


        //System.out.println("Length is: "+sll.length());
    }

}
