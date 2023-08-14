package dsa_dineshvaryani;

import java.util.Scanner;



public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search");
        int key= sc.nextInt();
        int pos=binarySearch(arr,key);
        if(pos==-1)
            System.out.println("Element is not present!!");
        else
            System.out.println("Element present at "+pos);



    }

    public static int binarySearch(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key) return mid;
            else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
