package dsa_dineshvaryani.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort ss=new SelectionSort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ss.printArray(arr);
        ss.sort(arr,n);
        ss.printArray(arr);

    }

    public void sort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
