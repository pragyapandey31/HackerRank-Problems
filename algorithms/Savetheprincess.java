import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Savetheprincess{

    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        int res[]=new int[test];
        for(int i=0;i<test;i++)
            {
        int n=in.nextInt();
            int m=in.nextInt();
            int s=in.nextInt();
            if(m>n)
                {
                if(m%n>0)
                    {
                    m=m%n;
                }
                else
                    m=n;
            }
            int pos=s+m-1;
            if(pos>n)
                {
               
                pos=pos-n;
                
            }
        
          res[i]=pos;
            
        }
        for(int i=0;i<test;i++)
       System.out.println(res[i]); 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
