package gfg;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter any element to search:");
        int key=sc.nextInt();
        int pos=search(arr,n,key);
        if(pos==-1)
            System.out.println("Element Not Found!");
        else
            System.out.println("Element found at "+(pos+1)+"th position");

    }

    private static int search(int[] arr, int n, int key) {
        for(int i=0;i<n;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
