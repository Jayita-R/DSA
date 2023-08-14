package NewDSA;

import java.util.Scanner;
//It is done by bitwise XOR operator also by O(n) time complexity
//all number present even number of times except any one no.
public class OddOccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(getOddOccurance(arr,n));
    }

    public static int getOddOccurance(int[] arr, int n) {
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count%2!=0)
                return arr[i];
        }
        return -1;
    }
}
