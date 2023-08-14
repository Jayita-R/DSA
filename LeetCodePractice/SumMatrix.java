package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class SumMatrix {
    public static void main(String[] args) {
        int[][] matrix={{56216},
                {63251},
                {75772},
                {1945},
                {27014}};

        List<Integer> minRow=new ArrayList<>();
        List<Integer> maxCol=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
            minRow.add(min);
        }

        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            maxCol.add(max);
        }

        System.out.print(minRow);
        System.out.print(maxCol);
    }
}
