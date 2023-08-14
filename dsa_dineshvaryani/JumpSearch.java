package dsa_dineshvaryani;

import java.util.Scanner;

public class JumpSearch {
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
        int pos=jumpSearch(arr,x,n);
        if(pos==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at "+(pos+1));
        }
    }

    public static int jumpSearch(int[] arr, int x, int n) {
        int m=(int)Math.floor(Math.sqrt(n));
        int i=0;
        while(arr[Math.min(m,n)-1]<x){
            i=m;
            m+=Math.sqrt(n);
            if(i>=n)
                return -1;

        }
        while(arr[i]<x){
            i++;
            if(i==Math.min(m,n))
                return -1;
        }
        if(arr[i]==x)
            return i;
        return -1;
    }
}
