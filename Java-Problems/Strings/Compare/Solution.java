import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int a=in.nextInt();
        String small=s.substring(0,a);
        String large=s.substring(0,a);
        for(int i=0;i<=s.length()-a;i++)
            {
   // System.out.println(i);
            if(small.compareTo(s.substring(i,i+a))>0)
                {
                small=s.substring(i,i+a);
                
            }
        if(large.compareTo(s.substring(i,i+a))<0)
            {
            large=s.substring(i,i+a);
        }
        }
       
    System.out.println(small);
        System.out.println(large);
    
    
    }
}
