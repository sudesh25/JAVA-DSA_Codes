// https://leetcode.com/problems/valid-anagram/description/
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
       String  s = "anagram"; 
       String t = "nagaram"; 
       System.out.println(isAnagram(s,t));
 }  
    static boolean isAnagram(String s, String t) { 
         if(s.length()!=t.length())
         {
            return false;
         }  
        
        char A []=s.toCharArray() ;  
        char B []=t.toCharArray() ;  
        Arrays.sort(A);
        Arrays.sort(B); 
        for (int i = 0; i < B.length; i++) {
              if(A[i]==B[i])
              {
                 
              } 
              else 
              {
                return false;
              }
        } 
        return true;

    }
}
