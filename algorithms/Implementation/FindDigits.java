import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
   int res=0;
        int m=n;
            while(m!=0)
                {
             int x=m%10;   
                if(x>0&&n%x==0)
                    {
                    res++;
                }
                m=m/10;
            }
        
        System.out.println(res);
        
        }
   
    
    
    
    
    }
}
