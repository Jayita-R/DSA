package backtobasics;

import java.util.Scanner;

public class Gcdlcm2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int on1=a;
        int on2=b;
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int gcd = b;
        int lcm = (on1 * on2) / gcd;
        System.out.println("GCD is " + gcd);
        System.out.println("LCM is " + lcm);
    }
}
