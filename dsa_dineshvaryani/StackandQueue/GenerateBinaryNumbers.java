package dsa_dineshvaryani.StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        String[] res=generateBinaryNumbers(n);

        System.out.println("Numbers are:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    private static String[] generateBinaryNumbers(int n) {
        String[] res=new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++){
            res[i]=q.poll();
            String n1=res[i]+"0";
            String n2=res[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return res;




    }
}
