package NewDSA;

import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Maximum contiguous sum is "+maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr) {
        int n=arr.length;
        int max_so_far=Integer.MIN_VALUE,max_ending=0;
        for(int i=0;i<n;i++){
            max_ending=max_ending+arr[i];
            if(max_so_far<max_ending){
                max_so_far=max_ending;
            }
            if(max_ending<0)
                max_ending=0;
        }
        return max_so_far;
    }
}
