package dsa_dineshvaryani.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs=new BubbleSort();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bs.printArray(arr);
        bs.sort(arr,n);
        bs.printArray(arr);

    }

    public void sort(int[] arr, int n) {
        boolean isSwapped;
        for(int i=0;i<n-1;i++){
            isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false) break;
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
