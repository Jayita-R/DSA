package LeetCodePractice;

public class StringNumberAtEnd {
    public static void main(String[] args) {


        String s="geeks5";
        int len=0;
        for(int i=0;i<s.length()-1;i++){
            ++len;
        }
        System.out.println(len);
        String slen=String.valueOf(len);
        if(slen.equals(s.charAt(s.length()-1))){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }


    }
}
