//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Pangram { 
    static Boolean pangram(String sentence)
    {   int count=0;
        for (char i = 'a'; i<='z'; i++)
         {
             for (int j = 0; j < sentence.length(); j++) {
                   if(i==sentence.charAt(j))
                   {
                      count++; 
                      break; 
                   }
             }            
        } 
        if(count==26) 
        {
            return true; 
        }  else{
             return false;

        }
    
    }
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";     //false--leetcode
        System.out.println(pangram(sentence));
    }
} 
