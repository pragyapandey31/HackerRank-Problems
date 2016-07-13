import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Jumpingontheclouds{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int flag=1;
        int i=0;
        int e=100;
 for(int j=0;j<n;)
     {
     j=j+k;
     e=e-1;
     //System.out.println(c[j]);
     if(j>=n)
         {
         j=0;
         if(c[j]==1)
         {
        e=e-2;
         }
        break;
         
       }
     if(c[j]==1&&j<n)
         {
        e=e-2;
         }
     }
    
   System.out.println(e); 
    
    }
}
