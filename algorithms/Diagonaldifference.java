import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonaldifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int psum=0;
        int ssum=0;
        for(int a_i=0; a_i < n; a_i++)
        {
            for(int a_j=0; a_j < n; a_j++)
            {
                a[a_i][a_j] = in.nextInt();
            if(a_i==a_j)
                psum=psum+a[a_i][a_j];    
            if((a_i+a_j)==(n-1))
                ssum=ssum+a[a_i][a_j];           
            }
        
        }
    

int sum=Math.abs(psum-ssum);
    System.out.println(sum);


    }}
