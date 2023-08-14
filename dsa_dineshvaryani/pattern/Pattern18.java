package dsa_dineshvaryani.pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int n=sc.nextInt();
        print18(n);

    }

    public static void print18(int n) {
        for(int i=0;i<n;i++){
            char ch= (char) ('E'-i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
