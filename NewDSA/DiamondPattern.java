package NewDSA;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:");
        int r=sc.nextInt();
        int spaces=r;
        int count=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=spaces+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=count;j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces -=2;
            count +=2;
        }
        spaces=1;
        count=r;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=spaces+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=count;j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces +=2;
            count -=2;
        }

    }
}
