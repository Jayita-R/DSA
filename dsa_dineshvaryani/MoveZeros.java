package dsa_dineshvaryani;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZeros(arr,n);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//In this program we basically move all zeroth elements to the end of the array by intact th order of non-zero elements.
// we used Two-pointer algorithm. where j will focus on zeroth elements and i will focus on non-zero elements.
    public static void moveZeros(int[] arr, int n) {
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
