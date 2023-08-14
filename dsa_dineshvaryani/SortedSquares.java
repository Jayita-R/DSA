package dsa_dineshvaryani;

import java.util.Scanner;

public class SortedSquares {
    public static void main(String[] args) {
        SortedSquares ss=new SortedSquares();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=ss.sortedSquares(arr);
        ss.printArray(res);
    }

    public void printArray(int[] res) {
        int n=res.length;
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }

    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int[] result=new int[n];
        int i=0;
        int j=n-1;
        for(int k=n-1;k>=0;k--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k]=arr[i]*arr[i];
                i++;
            }
            else{
                result[k]=arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
}
