package NewDSA;

import java.util.Scanner;

public class GCDArray {

    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    static int findGCD(int[] arr,int n){
        int res=arr[0];
        for(int ele:arr){
            res=gcd(res,ele);
            if(res==1){
                return 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("GCD is:"+findGCD(arr,n));
    }
}
