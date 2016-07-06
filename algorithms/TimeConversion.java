import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
if(time.substring(8).equals("AM"))
    {
    if(time.substring(0,2).equals("12"))
        {
       System.out.println("00"+time.substring(2,8));
        
    
    }
 else   
System.out.println(time.substring(0,8));
    
}
        else if(time.substring(0,2).equals("12"))
            {
            System.out.println(time.substring(0,8));
            
            
        }
           else
               {
               
               int a=Integer.parseInt(time.substring(0,2));
               a=a+12;
               System.out.println(a+time.substring(2,8));
               
               
           }
    
    
        
    }
}
