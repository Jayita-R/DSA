package NewDSA;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0,j=n-1;i<n/2;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        System.out.print("Reverse Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
