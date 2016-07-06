import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CuttheSticks{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int min=1000;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]<min){min=arr[arr_i];}
            
            
            
           
       }
     int flag=1; 
        
   while(flag==1)
       { int t=0;
        int nm=1000;
        flag=0;
               for(int i=0;i<n;i++)
        {
        if(arr[i]>0)
            {
            t++;
            arr[i]=arr[i]-min;
        
        }
        
    if(arr[i]<nm&&arr[i]>0)
        {
        nm=arr[i];
        flag=1;
    }
    
    }
   min=nm;
        System.out.println(t);
             //  System.out.println(nm);
   }
        
    
    
    }
}
