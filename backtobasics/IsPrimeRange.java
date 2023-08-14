package backtobasics;

import java.util.Scanner;

public class IsPrimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h;
        System.out.print("Enter the ranges: ");
        int low=sc.nextInt();
        int high= sc.nextInt();
        System.out.println("Prime numbers are");
        for(int i=low;i<=high;i++){
            h=i;
            int count=0;
            for(int j=2;j*j<=h;j++){
                if(h%j==0){
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(h);
        }
    }
}
