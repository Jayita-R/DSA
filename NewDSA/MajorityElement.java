package NewDSA;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findMajority(arr,n);
    }

    public static void findMajority(int[] arr, int n) {
        int max_count=0,index=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>max_count){
                max_count=count;
                index=i;
            }
        }
        if(max_count>n/2)
            System.out.print(arr[index]);
        else
            System.out.print("No majority element");

    }
}
