import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][] ar=new int[n][m];

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                ar[i][j]=scn.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=ar.length-1;
        int maxc=ar[0].length-1;
        int tn=n*m;
        int cnt=0;
        while(cnt<tn){
            for(int i=minr,j=minc;i<=maxr && cnt<tn;i++){
                System.out.println(ar[i][j]);
                cnt++;
            }
            minc++;
            for(int i=maxr,j=minc;j<=maxc && cnt<tn;j++){
                System.out.println(ar[i][j]);
                cnt++;
            }
            maxr--;
            for(int i=maxr,j=maxc;i>=minr && cnt<tn;i--){
                System.out.println(ar[i][j]);
                cnt++;
            }
            maxc--;
            for(int i=minr,j=maxc;j>=minc && cnt<tn;j--){
                System.out.println(ar[i][j]);
                cnt++;
            }
            minr++;
        }
    }
 
}
