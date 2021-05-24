import java.io.*;
import java.util.*;

public class StateOfWakanda1{

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][] ar1=new int[n][m];

        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar1[0].length;j++){
                ar1[i][j]=scn.nextInt();
            }
        }

        for(int j=0;j<ar1[0].length;j++){
           if(j%2==0){
               for(int i=0;i<ar1.length;i++){
                   System.out.println(ar1[i][j]);
               }
               }
           else{
               for(int i=ar1.length-1;i>=0;i--) {
                   System.out.println(ar1[i][j]);
               }
           }
        }
    }

}