package dsa_dineshvaryani;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x=sc.nextInt();
        int pos=search(arr,x);
        if(pos==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at "+(pos+1));
        }

    }

    public static int search(int[] arr, int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
