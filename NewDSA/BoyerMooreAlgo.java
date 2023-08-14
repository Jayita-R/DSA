package NewDSA;

import java.util.Scanner;

//Boyer-Moore Majority voting algo-it is the algorithm to find majority element in the array
public class BoyerMooreAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maj=findMajority(arr,n);
        System.out.print("The majority element is: "+maj);
    }

    public static int findMajority(int[] arr, int n) {
        int count=0,cand=-1;
        //Finding majority candidate
        for(int index=0;index<n;index++) {
            if (count == 0) {
                cand = arr[index];
                count = 1;
            } else {
                if (arr[index] == cand)
                    count++;
                else
                    count--;
            }
        }
            count = 0;
            for (int index = 0; index < n; index++) {
                if (arr[index] == cand)
                    count++;
            }
            if (count > (n / 2))
                return cand;
            return -1;
        }
}
