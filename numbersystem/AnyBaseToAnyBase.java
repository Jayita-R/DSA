package numbersystem;

import java.util.Scanner;



public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= scn.nextInt();
        System.out.print("Enter base value for the number:");
        int b1= scn.nextInt();
        System.out.print("Enter a base value in which you want to see the number:");
        int b2= scn.nextInt();
        int dn=getValue(num,b1,b2);
        System.out.println(dn);
    }


    public static int getValue(int num, int b1, int b2) {
        int dec=getValueToDecimal(num,b1);
        int fvalue=getValueInBase(dec,b2);
        return fvalue;

    }

    public static int getValueToDecimal(int num, int b1) {
        int rv=0,rem;
        int p=1;
        while(num>0){
            rem=num%10;
            num/=10;

            rv+=rem*p;
            p=p*b1;
        }

        return rv;
    }
    public static int getValueInBase(int dec, int b2){
        int rv=0,rem;
        int p=1;
        while(dec>0){
            rem=dec%b2;
            dec/=b2;

            rv+=rem*p;
            p=p*10;
        }

        return rv;
    }
}
