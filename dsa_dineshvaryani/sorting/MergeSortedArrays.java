package dsa_dineshvaryani.sorting;

import java.util.Scanner;

public class MergeSortedArrays {
    public int[] merge(int[] arr1,int[] arr2,int n,int m){
        int[] result=new int[n+m];
        int i=0; //traverse arr1
        int j=0; //traverse arr2
        int k=0; //traverse res
        while(i<n && j<m){  //boundary conditions
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        //either arr1 got exhausted or arr2 got exhausted
        while(i<n){//arr2 got exhausted
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){//arr1 got exhausted
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSortedArrays msa=new MergeSortedArrays();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of element for 1st array:");
        int n=sc.nextInt();
        System.out.print("Enter the no. of element for 2nd array:");
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.print("Enter elements for 1st array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter elements for 2nd array:");
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        int[] res=msa.merge(arr1,arr2,n,m);
        System.out.println("Final array");
        msa.printArray(res);


    }
}
