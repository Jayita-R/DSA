package dsa_dineshvaryani.StackandQueue;

import java.util.Stack;
public class QueueUsingStacksLessComplexity {
    public static void main(String[] args) {
        MyQueue2 q = new MyQueue2();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());
    }
}

class MyQueue2{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public MyQueue2(){

    }

    public void push(int x){
        System.out.println("The element pushed is - "+x);
        s1.push(x);
    }

    public int pop(){
        if(s2.isEmpty()==true){
            while(s1.isEmpty()==false){
                s2.push(s1.peek());
                s1.pop();
            }
        }
        int x=s2.peek();
        s2.pop();
        return x;

    }

    /** Get the front element. */
    public int peek() {
        // shift input to output
        if (s2.isEmpty()==true)
            while (s1.isEmpty() == false) {
                s2.push(s1.peek());
                s1.pop();
            }
        return s2.peek();
    }
    int size() {
        return (s2.size() + s1.size());
    }

}
