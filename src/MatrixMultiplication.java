
import java.io.*;
import java.util.*;

public class MatrixMultiplication{

    public static void main(String[] args) throws Exception {
        
        Scanner scn= new Scanner(System.in);
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        int [][] ar1=new int[r1][c1];

        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar1[0].length;j++){
                ar1[i][j]=scn.nextInt();
            }
        }
        int r2=scn.nextInt();
        int c2=scn.nextInt();
        int [][] ar2=new int[r2][c2];

        for(int i=0;i< ar2.length;i++){
            for(int j=0;j<ar2[0].length;j++){
                ar2[i][j]=scn.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Invalid input");
            return;
        }
        int mat[][]=new int[r1][c2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                for (int k=0;k<r2;k++){
                    mat[i][j]+=ar1[i][k]*ar2[k][j];
                }
            }
        }
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

}
