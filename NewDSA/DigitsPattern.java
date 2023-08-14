package NewDSA;

import java.util.Scanner;

public class DigitsPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:");
        int r= sc.nextInt();

        int spaces=r-1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces--;
        }

        spaces=1;
        for(int i=r-1;i>=1;i--){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces++;
        }
    }
}
