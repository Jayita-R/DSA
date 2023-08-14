package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(j+"\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if(i==n){
                st--;
            }
            for (int j = st; j>=1; j--) {
                System.out.print(j+"\t");
            }
            st++;
            sp-=2;
            System.out.println();
        }

    }
}
