package dsa_dineshvaryani.StackandQueue;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}

class MyQueue{
    Stack<Integer> in=new Stack<>();
    Stack<Integer> ou=new Stack<>();

    public MyQueue(){

    }

    public void push(int x){
        while (in.empty() == false) {
            ou.push(in.peek());
            in.pop();
        }
        // Insert the desired element in the stack input
        System.out.println("The element pushed is " + x);
        in.push(x);
        // Pop out elements from the stack output and push them into the stack input
        while (ou.empty() == false) {
            in.push(ou.peek());
            ou.pop();
        }
    }
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // shift input to output
        if (in.empty()) {
            System.out.println("Stack is empty");

        }
        int val = in.peek();
        in.pop();
        return val;

    }

    /** Get the front element. */
    public int peek() {
        // shift input to output
        if (in.empty()) {
            System.out.println("Stack is empty");

        }
        return in.peek();
    }


    int size() {
        return in.size();
    }
}
