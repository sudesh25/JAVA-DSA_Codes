// https://www.geeksforgeeks.org/problems/java-reverse-a-string0416/1?page=1&category=Strings&difficulty=Basic&sortBy=submissions
import java.util.ArrayList;
import java.util.Arrays;
public class Reverse {
     public static void main(String[] args) {
         String  str = "GeeksforGeeks"; 
         System.out.println(revStr(str));
     }  
     static String revStr(String s) {
    
        char [] str = s.toCharArray();
        int front= 0 ;
        int end = str.length-1; 
        char temp;
        for (int i = 0; i < str.length/2; i++) {
            
           temp  = str[end];
           str[end] = str[front];
           str[front] = temp ; 
           front++ ; 
           end-- ; 
          
        }   
      String ans = new String (str);
      
    //  System.out.println(str.toString());
        return ans;
     }
} 



