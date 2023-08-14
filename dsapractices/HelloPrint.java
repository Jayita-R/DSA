package dsapractices;

public class HelloPrint {
    public static void main(String[] args) {
        printHello(5);
    }
    static void printHello(int n){
        if(n==0)
            return;
        System.out.println("Hello Jayita!");
        printHello(n-1);
    }
}
