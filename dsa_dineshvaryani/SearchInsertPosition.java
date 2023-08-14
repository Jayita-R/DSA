package dsa_dineshvaryani;

import java.util.Scanner;

public class SearchInsertPosition {
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
        int pos=searchInsert(arr,key);
        System.out.println("Element present at "+pos);



    }

    public static int searchInsert(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
