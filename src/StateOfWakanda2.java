import java.io.*;
import java.util.*;

public class StateOfWakanda2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][] arr=new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int g=0;g<arr.length;g++){
            for(int i=0, j=g;j< arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }



}