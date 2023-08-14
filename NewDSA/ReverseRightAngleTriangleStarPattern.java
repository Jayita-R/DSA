package NewDSA;

import java.util.Scanner;

public class ReverseRightAngleTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row:");
        int r= sc.nextInt();

        for(int i=0;i<r;i++){
            for (int j=0;j<r;j++){
                if(j<i)
                  System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
