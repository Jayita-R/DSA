package LeetCodePractice;

import java.util.Scanner;

public class StringProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="hkrrtbxwkabeihgcdqew";
        int len=0;
        int i=s.length()-1;
        while(i>=0){

            if(s.charAt(i)==' '){
                break;
            }else{
                ++len;
            }
            --i;
        }
        System.out.println(len);
    }
}
