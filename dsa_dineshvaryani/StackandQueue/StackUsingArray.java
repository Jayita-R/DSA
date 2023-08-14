package dsa_dineshvaryani.StackandQueue;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.isEmpty());
        s.pop();
        s.push(6);
        s.push(7);
        s.push(2);
        System.out.println(s.isEmpty());
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());

    }
}

class Stack{
    int size=100;
   int[] arr=new int[size];
   int top=-1;

   void push(int x){
       ++top;
       arr[top]=x;
   }

   int pop(){
       if(isEmpty()){
           System.out.println("No element present in the stack to delete");
           return 0;
       }
       int el=arr[top];
       --top;
       return el;
   }

   int top(){
       return arr[top];
   }

   int size(){
       return top+1;
   }
   boolean isEmpty(){
       return top==-1;
   }

}
