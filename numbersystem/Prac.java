package numbersystem;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res="";
        for(int i=1;i<=n;i++){
            if(i%2==0)
                res="EVEN";
            else
                res="ODD";
        }
        System.out.println(res);
    }
}
