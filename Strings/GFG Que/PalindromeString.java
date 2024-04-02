// https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&category=Strings&difficulty=Easy,Medium&sortBy=submissions

public class PalindromeString {
    public static void main(String[] args) {
       String  S = "abba";
       System.out.println(isPalindrome(S));
    } 
   static  int isPalindrome(String S) { 
       
       if(S.length()==1)
       {
        return 1;
       }
            
       for (int i = 0; i < S.length()/2; i++) {
               
           if(S.charAt(i)!=S.charAt(S.length()-1-i)){
                 
            return 0;
           }
       } 
       return 1;
    }
}
