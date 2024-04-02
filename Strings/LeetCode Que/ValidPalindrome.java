// https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome{
     
    public static void main(String[] args) {
        String s = " ";  
        System.out.println(isPalindrome(s));

    } 
    static  boolean isPalindrome(String s) { 

        if(s==null || s.length()==0 ) 
        { 
           return true;
        }
         s=s.replace(" ", "");  

        s = s.replaceAll( "[^a-zA-Z0-9]", "");

         s =  s.toLowerCase();   

         if(s==null || s.length()==0 || s.length()==1) 
         { 
            return true;
         }
        boolean Flag=false; 
        System.out.println(s);
       for (int i = 0; i < s.length()/2; i++) {
               
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {
                 Flag=true;
            } 
            else {
                  return false;
            }
       } 
       return Flag;


    }
}