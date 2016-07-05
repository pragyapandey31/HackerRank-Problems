import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            String sp=new String(new char[n-1-i]).replace('\0',' ');
            String h=new String(new char[i+1]).replace('\0','#');
                System.out.println(sp+h);
            
            
            
        }
    }
}
