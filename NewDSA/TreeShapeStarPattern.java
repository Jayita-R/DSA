package NewDSA;

import java.util.Scanner;

public class TreeShapeStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int r=sc.nextInt();
        int spaces=r-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
        spaces=1;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=i;j<r-1;j++){
                System.out.print("* ");
            }
            System.out.println();
            spaces++;
        }
    }
}
