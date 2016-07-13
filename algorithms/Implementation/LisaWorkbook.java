import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisaWorkbook{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner in = new Scanner(System.in);
int n = in.nextInt();
     int k=in.nextInt();
        int prob[]=new int[n];
        for(int i=0;i<n;i++)
            {
            prob[i]=in.nextInt();
            
            }
        int ch=0;
        int s=0;
        int sp=0;
     for(int i=1;;i++)
         {
        
         int ns=s;
            
             s=s+k;

         if(s<prob[ch])
             {
         if(i>ns&&i<=s)
                sp++;
             
         }
    if(s==prob[ch])
         {


        if(i>ns&&i<=s)
                sp++;
          
      
       ch++;
        s=0;
      
     }
 if(ch==n)
{

         break;}
     if(s>prob[ch])
         {
         s=prob[ch];
     if(i>ns&&i<=s)
                sp++;
         ch++;s=0;
     }
     if(ch==n)
{

         break;}
     }
    
    System.out.println(sp);
    
    }
}
