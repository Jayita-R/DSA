package gfg;

import java.util.Scanner;

public class BinarySearch {
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
        System.out.println("Element is at: "+bSearch(arr,0,n,key));
    }

    private static int bSearch(int[] arr, int low, int high, int key) {
         if(high<low)
             return -1;
         int mid=(low+high)/2;
         if(key==arr[mid])
             return mid;
         if(key>arr[mid])
             return bSearch(arr,mid+1,high,key);
         return bSearch(arr,low,mid-1,key);
    }
}
