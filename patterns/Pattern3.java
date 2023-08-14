package patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){

            for(int space=1;space<i;space++){
                System.out.print("\t");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
