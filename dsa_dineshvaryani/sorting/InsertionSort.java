package dsa_dineshvaryani.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort is=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        is.printArray(arr);
        is.sort(arr,n);
        is.printArray(arr);

    }

    public void sort(int[] arr, int n) {
        for(int i=1;i<n;i++){//unsorted part
            int temp=arr[i];
            int j=i-1; //sorted part
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j]; //shifting larger elements to temp by 1 position
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }

    public void printArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
