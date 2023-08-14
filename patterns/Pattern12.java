package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=0,val1=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+"\t");
                int res = val + val1;
                val = val1;
                val1 = res;
            }
            System.out.println();
        }
    }
}
