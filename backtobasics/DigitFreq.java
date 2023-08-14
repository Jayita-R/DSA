package backtobasics;

import java.util.Scanner;

public class DigitFreq {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= scn.nextInt();
        System.out.print("Enter the digit that you want to search to count in total:");
        int d= scn.nextInt();
        int count=0,rem;
        while(num!=0){
            rem=num%10;
            if(rem==d){
                count++;
            }
            num/=10;
        }
        System.out.print(count);

    }
}
