import java.util.*;
public class MoveString {
     public static void main(String[] args) {
         String a="axbdxwebcxdjwxx";
         count(a, 0, 0,"");
         
     }  
     public static void count(String a,int index,int count,String newString)
     {
           if(index==a.length())
           {
             for (int i = 0; i < count; i++) {
                 newString +="x";
             } 
             System.out.println(newString); 
             return ;
           
           }    
            if(a.charAt(index)=='x')
            {
                count++; 
            } 
            else 
            {
               newString +=a.charAt(index);
            } 
            count(a,index+1,count,newString);
     } 
    
    
     }

