package gfg;

import java.util.Scanner;

public class ArrayRightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter any position we want to rotate the array:");
        int d = sc.nextInt();
        rightRotate(arr, d, n);
    }

    private static void rightRotate(int[] arr, int d, int n) {
        d=d%n;
        for(int i=0;i<n;i++){
            if(i<d){
                System.out.print(arr[n+i-d]+" ");
            }
            else{
                System.out.print(arr[i-d]+" ");
            }
        }
    }
}
