package dsa_dineshvaryani.StackandQueue;

import java.util.EmptyStackException;

//stack implementation using linked list
public class StackImplementation {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public StackImplementation(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){

        return length==0;
    }

    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();

        int res=top.data;
        top=top.next;
        length--;

        return res;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();

        return top.data;
    }

    public static void main(String[] args) {
        StackImplementation stack=new StackImplementation();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        //System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
