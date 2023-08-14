package numbersystem;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= scn.nextInt();
        System.out.print("Enter a base value in which you can see the number:");
        int b= scn.nextInt();
        int dn=getValueInBase(num,b);
        System.out.println(dn);
    }

    public static int getValueInBase(int num, int b) {
        int rv=0,rem;
        int p=1;
        while(num>0){
            rem=num%b;
            num/=b;

            rv+=rem*p;
            p=p*10;
        }

        return rv;

    }
}
