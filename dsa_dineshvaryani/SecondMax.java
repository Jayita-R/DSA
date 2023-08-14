package dsa_dineshvaryani;

public class SecondMax {
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={13,34,2,34,33,1};
        printArray(arr);
        int smax=findSecondMax(arr);
        System.out.println("Second Maximum element is: "+smax);

    }

    public static int findSecondMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
