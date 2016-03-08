import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       boolean flag=true;
       if(A.length()!=B.length()||A.length()>50||B.length()>50)
           {
           return false;
           
       }
      for(int i=0;i<A.length();i++)
         {
       char c=A.charAt(i);
          int fa=0;
          int fb=0;
          for(int j=0;j<B.length();j++)
              {
                 if(B.charAt(j)==c)
                  {
                  fb++;
                  }
              
              }
          for(int a=0;a<A.length();a++)
              {
              if(A.charAt(a)==c)
                  {
              fa++;
              }}
          if(fa!=fb)
              {flag=false;
              break;
          }
      } 
    return flag;     
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next().toLowerCase();
        String B=sc.next().toLowerCase();
//System.out.println(A);
//System.out.println(B);
        boolean ret=isAnagram(A,B);
        
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
