package gfg;

import java.util.Scanner;

public class ArrayLeftRotation2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter any position we want to rotate the array:");
            int d = sc.nextInt();
            rotate(arr, d, n);
            System.out.println("Final array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
    }


        private static void rotate ( int[] arr, int d, int n){
           int p=1;
           while(p<=d){
               int last=arr[0];
               for (int i=0;i<n-1;i++){
                   arr[i]=arr[i+1];
               }
               arr[n-1]=last;
               p++;
           }
        }
}