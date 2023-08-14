package backtobasics;

import java.util.Scanner;

public class Gcdlcm {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print(" Enter the numbers: ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int gcd=1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
}
