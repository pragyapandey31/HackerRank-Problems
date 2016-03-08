import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
      int j=A.length()-1;
        int flag=0;
        for(int i=0;i<A.length()/2;i++)
            {
            if(A.charAt(i)!=A.charAt(j))
                {
                flag=1;
                break;
            }
            j--;
            
        }
        if(flag==0)
            {
                System.out.println("Yes");
                    
                    
        }
        else
            {
             System.out.println("No");
        }
        
    }
}
