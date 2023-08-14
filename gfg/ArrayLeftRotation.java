package gfg;

import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter any position we want to rotate the array:");
        int d= sc.nextInt();
        rotate(arr,d,n);
        System.out.println("Final array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rotate(int[] arr, int d, int n) {
        int[] temp=new int[n];
        int k=0;
        for(int i=d;i<n;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}
