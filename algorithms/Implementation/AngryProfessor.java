import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();//students
            int k = in.nextInt();//threshold
            int a[] = new int[n];
            int res=0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i]<=0)
                {
                    res++;
                       //System.out.println(a[a_i]);
                }
                
            }
       
        if(res>=k)
            {
            System.out.println("NO");
        }
        else
            System.out.println("YES");
        
        }
    }
}
