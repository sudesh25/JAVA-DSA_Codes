// 
import java.util.HashSet;
public class UniqueSubsequences {
     
    public static void  Subsequences(String str,int idx,String newString,HashSet<String> set)
       {
            if(idx==str.length())
            { 
                  if(set.contains(newString)) 
                  {
                    return ;
                  }  
                  else 
                  {
                    System.out.println(newString);
                    set.add(newString);
                    return ;
                  }
               

               
              
            } 
            char cuchar=str.charAt(idx); 
            Subsequences(str, idx+1, newString+cuchar,set); 
            Subsequences(str, idx+1, newString,set);
       }
    public static void main(String[] args) {
         String str="aaa";  
         HashSet<String> set = new HashSet<>();
         Subsequences(str, 0, "",set);
    }
        
    
}
