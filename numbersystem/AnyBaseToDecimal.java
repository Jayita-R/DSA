package numbersystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= scn.nextInt();
        System.out.print("Enter a base value in which you can see the number:");
        int b= scn.nextInt();
        int dn=getValueToDecimal(num,b);
        System.out.println(dn);
    }

    public static int getValueToDecimal(int num, int b) {
        int rv=0,rem;
        int p=1;
        while(num>0){
            rem=num%10;
            num/=10;

            rv+=rem*p;
            p=p*b;
        }

        return rv;
    }
}
