    import java.io.*;
    import java.util.*;



    public class Solution {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
        //Complete the code
            if(s.length()<=400000|| s.replaceAll("\\s","").length()!=0)
                {
            s=s.trim();
            String d="[ !,?.\\_'@]+";
            String tokens[]=s.split(d);
            System.out.println(tokens.length);
            for(int i=0;i<tokens.length;i++)
                {
                System.out.println(tokens[i]);
            }

        }
    }
    }
