package dsa_dineshvaryani;

import java.util.Scanner;

public class ArrangeMaxMin {
    public static void main(String[] args) {
        ArrangeMaxMin am=new ArrangeMaxMin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        am.arrangeMaxMin(arr);
        am.printArray(arr);
    }

    public void printArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrangeMaxMin(int[] arr) {
        int maxIdx=arr.length-1;
        int minIdx=0;
        int max=arr[maxIdx]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[maxIdx]%max)*max;
                maxIdx--;
            }else{
                arr[i]=arr[i]+(arr[minIdx]%max)*max;
                minIdx++;
            }
        }
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]/max;
        }
    }
}
