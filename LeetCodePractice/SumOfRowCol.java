package LeetCodePractice;

public class SumOfRowCol {
    public static void main(String[] args) {
        int[][] A={{1,2},
                {2,1}};

        int N=2;
        int M=2;
        int ind=Math.min(N,M);
        int[] rSum=new int[ind];
        int[] cSum=new int[ind];
        for(int i=0;i<ind;i++){
            int sum=0;
            for(int j=0;j<ind;j++){
                sum+=A[i][j];
            }
            rSum[i]=sum;
        }

        for(int i=0;i<ind;i++){
            System.out.print(rSum[i]+" ");
        }
        System.out.println();

        for(int i=0;i<ind;i++){
            int sum=0;
            for(int j=0;j<ind;j++){
                sum+=A[j][i];
            }
            cSum[i]=sum;
        }

        for(int i=0;i<ind;i++){
            System.out.print(cSum[i]+" ");
        }
        System.out.println();

        for(int i=0;i<ind;i++){
            if(rSum[i]!=cSum[i]){
                System.out.println(0);
            }
        }
        System.out.println(1);
    }
}
