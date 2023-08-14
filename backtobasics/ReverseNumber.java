package backtobasics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int rem;
        System.out.println("Reverse numbers");
        while(n!=0){
            rem=n%10;
            System.out.println(rem);
            n/=10;
        }

    }
}
