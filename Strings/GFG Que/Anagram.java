/// https://www.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&category=Strings&difficulty=Easy,Medium&sortBy=submissions
import java .util.*;
public class Anagram {
    public static void main(String[] args) {
      String  a = "geeksforgeeks"; 
      String b = "forgeeksgeeks"; 
      System.out.println(isAnagram(a,b));
    } 
   static boolean isAnagram(String a,String b)
    {   
        if(a.length()!=b.length()) 
        {
            return false;
        } 

        char[]X=a.toCharArray();
        char[]Y=b.toCharArray(); 
        
        Arrays.sort(X); 
        Arrays.sort(Y); 
        for (int i = 0; i < Y.length; i++) {
             if(X[i]!=Y[i])
             {
                return false;
             }
        } 
        return true;
    
        
    }
}
