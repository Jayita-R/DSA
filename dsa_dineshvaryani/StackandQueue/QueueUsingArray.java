package dsa_dineshvaryani.StackandQueue;

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        System.out.println(q.isEmpty());
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        q.push(6);
        //q.push(7);
        System.out.println(q.isEmpty());
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
        q.push(9);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        q.push(10);
        //q.printAllElement();
    }
}

class Queue1{
    private int[] arr;
    private int front,rear,curSize,maxSize;
    public Queue1(){
        arr=new int[20];
        front=-1;
        rear=-1;
        curSize=0;
    }
    public Queue1(int maxSize){
        this.maxSize = maxSize;
        arr=new int[maxSize];
        front=-1;
        rear=-1;
        curSize=0;
    }

    public void push(int newElement){
        if(curSize==maxSize){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(rear==-1){
            front=0;
            rear=0;
        }else{
            rear=(rear+1)%maxSize;
        }
        arr[rear]=newElement;
        System.out.println("The element pushed is - "+newElement);
        curSize++;
    }

    public int pop(){
        if(front==-1){
            System.out.println("Queue is empty");
            //System.exit(1);
        }
        int el=arr[front];
        if(curSize==1){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%maxSize;
        }
        curSize--;
        return el;
    }
    public int top() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            //System.exit(1);
        }
        return arr[front];
    }
    public int size() {
        return curSize;
    }

    public boolean isEmpty(){
        return curSize==0;
    }

   /* public void printAllElement(){
        for(int i=front;i<rear-1;i++){
            System.out.print(arr[i]+" ");
        }
    }*/

}
