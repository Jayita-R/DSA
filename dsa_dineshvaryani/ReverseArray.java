package dsa_dineshvaryani;

public class ReverseArray {

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={6,5,1,18,9,22};
        printArray(arr);
        reverse(arr,0, arr.length-1);
        printArray(arr);

    }
}
