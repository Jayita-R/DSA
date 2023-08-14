package NewDSA;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairsBSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter sum value:");
        int k=sc.nextInt();
        System.out.print("Count of pairs is:"+getPairsCount(arr,n,k));
    }

    public static int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n-1;i++){
            int x=k-arr[i];
            int y=lowerBound(arr, i + 1, n, x);
            int z=upperBound(arr, i + 1, n, x);
            c=c+z-y;
        }
        return c;
    }

    public static int upperBound(int[] arr, int start, int end, int key) {
         while(start<end){
             int mid=start+(end-start)/2;
             if(arr[mid]<=key){
                 start=mid+1;
             }else{
                 end=mid;
             }
         }
         return start;
    }

    public static int lowerBound(int[] arr, int start, int end, int key) {
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}
