// https://www.geeksforgeeks.org/problems/find-the-n-th-character5925/1?page=2&category=Strings&difficulty=Medium&sortBy=submissions
import java .util .*;
public class FindNChar {
     public static void main(String[] args) {
         String s = "11111";
         int r = 1;
         int n = 4 ;
        System.out.println(nthCharacter(s,r,n));
     }  
   static  char nthCharacter(String s, int r, int n)
    {    
        StringBuilder ans=new StringBuilder(s); 
        
         for (int i = 1; i <= r; i++) {  
                
            StringBuilder temp=new StringBuilder(); 
             for (int j = 0; j < ans.length(); j++) {
                  char B=ans.charAt(j); 
                  if(B=='1')
                  {
                    temp.append('1').append('0');
                  } 
                  else 
                  {
                    temp.append('0').append('1') ;
                  }
             } 
             ans=temp;
         }  
         System.out.println(ans);
         return ans.charAt(n);
    }

}
 