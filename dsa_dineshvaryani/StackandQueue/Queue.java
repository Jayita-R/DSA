package dsa_dineshvaryani.StackandQueue;

import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public Queue(){
        front=null;
        rear=null;
        length=0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;
    }

    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current=front;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public int dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Queue is already empty");

        int res=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        --length;
        return res;
    }

    public int first(){
        if(isEmpty()) throw new NoSuchElementException("Queue is already empty");

        return front.data;
    }

    public int last(){
        if(isEmpty()) throw new NoSuchElementException("Queue is already empty");

        return rear.data;
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(34);

        q.print();

        /*q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();*/
        System.out.println(q.first());
        System.out.println(q.last());
    }
}
