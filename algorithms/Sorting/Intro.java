import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Intro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in =new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        int ind=-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=in.nextInt();
            if(a[i]==k)
                {
                ind=i;
            }
        }
    System.out.println(ind);
    
    }
}
