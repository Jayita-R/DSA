package NewDSA;

import java.util.Scanner;

public class TwoPointersTec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter value:");
        int val=sc.nextInt();
        System.out.println(isPairSum(a,n,val));
    }

    public static int isPairSum(int[] a, int n, int val) {
        int i=0,j=n-1;
        while(i<j){
            if(a[i]+a[j]==val)
                return 1;
            else if (a[i]+a[j]<val)
                i++;
            else
                j--;
        }
        return 0;
    }
}
