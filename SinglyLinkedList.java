package LinkedList;

public class SinglyLinkedList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public void display(ListNode head) {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		System.out.println("null");
		
	}
	
	public void insertAtBegin(int val) {
		ListNode newNode=new ListNode(val);
		newNode.next=head;
		head=newNode;
	}
	
	public void insert(int pos,int data) {
		ListNode node=new ListNode(data);
		if(pos==1) {
			node.next=head;
			head=node;
		}else {
			ListNode previous=head;
			int cnt=1;
			while(cnt<pos-1) {
				previous=previous.next;
				++cnt;
			}
			ListNode current= previous.next;
			node.next=current;
			previous.next=node;
		}
	}
	
	public void insertAtEnd(int val) {
		ListNode newNode=new ListNode(val);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		
		return temp;
		
	}
	
	public ListNode deleteLast() {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode current=head;
		ListNode prev=null;
		while(current.next!=null) {
			prev=current;
			current=current.next;
		}
		prev.next=null;
		return current;
	} 
	
	public void delete(int pos) {
		if(pos==1) {
			head=head.next;
		}
		else {
			ListNode prev=head;
			int cnt=1;
			while(cnt<pos-1) {
				prev=prev.next;
				cnt++;
			}
			ListNode current=prev.next;
			prev.next=current.next;
		}
	}
	
	public ListNode reverse(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current=head;
		ListNode prev=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		return prev;
	}
	
	public ListNode getMiddleNode() {
		if(head==null) {
			return null;
		}
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public boolean searchElement(ListNode head,int key) {
		if(head==null) {
			return false;
		}
		ListNode current=head;
		while(current!=null) {
			if(current.data==key) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public int length() {
		if(head==null) return 0;
		int count=0;
		ListNode current=head;
		while(current!=null) {
			++count;
			current=current.next;
		}
		return count;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll=new SinglyLinkedList();
		/*sll.head=new ListNode(10);
		ListNode s=new ListNode(8);
		ListNode t=new ListNode(2);
		ListNode f=new ListNode(19);
		
		sll.head.next=s;
		s.next=t;
		t.next=f;*/
		
		/*sll.insertAtBegin(10);
		sll.insertAtBegin(8);
		sll.insertAtBegin(2);*/
		/*sll.insertAtEnd(19);
		sll.insertAtEnd(8);
		sll.insertAtEnd(1);*/
		
		sll.insert(1,6);
		sll.insert(1,4);
		sll.insert(2,8);
		sll.insert(4,7);
		
		
		sll.display(sll.head);
		
		//System.out.println(sll.deleteFirst().data);
		//System.out.println(sll.deleteFirst().data);
		
		//System.out.println(sll.deleteLast().data);
		//System.out.println(sll.deleteLast().data);
		
		/*sll.delete(3);
		sll.delete(1);
		sll.delete(2);
		
		sll.display();*/
		
		/*if(sll.searchElement(sll.head,11)) {
			System.out.println("Key found!!");
		}else {
			System.out.println("Key not found!!");
		}*/
		
		/*ListNode revNodes=sll.reverse(sll.head);
		
		sll.display(revNodes);*/
		
		ListNode middleNode=sll.getMiddleNode();
		System.out.println("Middle Node is - "+ middleNode.data);
		
		//System.out.println("Length is - "+sll.length());
		

	}

}
