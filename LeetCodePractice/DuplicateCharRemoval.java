package LeetCodePractice;

import java.util.*;

public class DuplicateCharRemoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String res=sc.next();
        System.out.println("Final string is:"+ removeDuplicates(res));
    }

    private static String removeDuplicates(String res) {
        String ans="";
        Map<Character,Integer> mpp=new HashMap<>();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<res.length();i++){
            mpp.put(res.charAt(i),mpp.getOrDefault(res.charAt(i),0)+1);
        }
        for(char ch:mpp.keySet()){
            list.add(ch);
        }
        for(int i=0;i<list.size();i++){
            ans+=list.get(i);
        }
        return ans;
    }
}
