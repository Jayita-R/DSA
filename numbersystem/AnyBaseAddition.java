package numbersystem;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the base value:");
        int b= scn.nextInt();
        System.out.print("Enter numbers:");
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int d=getSum(b,n1,n2);
        System.out.println(d);

    }

    public static int getSum(int b, int n1, int n2) {
        int rv=0;
        int c=0,p=1;
        while(n1>0||n2>0||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1/=10;
            n2/=10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;

            rv+=d*p;
            p=p*10;

        }
        return rv;
    }

}
