package dsa_dineshvaryani;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mnum=findMissingNumber(arr);
        System.out.println("Missing number is: "+mnum);
    }

    public static int findMissingNumber(int[] arr) {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;

    }
}
