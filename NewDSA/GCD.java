package NewDSA;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
                g=i;
        }
        System.out.println("GCD of "+a+" and "+b+" is:"+g);
    }
}
