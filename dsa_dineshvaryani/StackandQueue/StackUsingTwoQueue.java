package dsa_dineshvaryani.StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}

class stack{
    Queue<Integer> q1 = new LinkedList < > ();
    Queue<Integer> q2 = new LinkedList< >();

    void push(int x) {
        q2.add(x);
        while(q1.isEmpty()==false){
            q2.add(q1.peek());
            q1.remove();
        }

        while(q2.isEmpty()==false){
            q1.add(q2.peek());
            q2.remove();
        }

    }
    int pop() {
        return q1.remove();
    }
    int top() {
        return q1.peek();
    }
    int size() {
        return q1.size();
    }
}
