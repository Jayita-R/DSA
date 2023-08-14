package dsa_dineshvaryani;

public class ResizeArray {
    public static void main(String[] args) {
        ResizeArray ra=new ResizeArray();
        int[] original=new int[]{5,1,2,9,7};
        System.out.println(original.length);
        original=ra.resize(original,10);
        System.out.println(original.length);

    }

    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr,int capacity) {
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
}
