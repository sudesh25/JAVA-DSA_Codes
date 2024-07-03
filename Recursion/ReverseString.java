// TC = Length of String ,  O(n) where n=string length

public class ReverseString {
     public static void main(String[] args) {
         String ans="abcd"; 
         Reverse(ans, ans.length()-1);
     } 
     public static void Reverse(String a,int index) 
     {
         if(index==-1)
         {
            return;
         } 
         System.out.print(a.charAt(index)); 
         Reverse(a,index-1);
     } 
}
 