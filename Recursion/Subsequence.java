// Most imp 

public class Subsequence {
       public static void  Subsequences(String str,int idx,String newString )
       {
            if(idx==str.length())
            {
                System.out.println(newString);
                return ;

            } 
            char cuchar=str.charAt(idx); 
            Subsequences(str, idx+1, newString+cuchar); 
            Subsequences(str, idx+1, newString);
       }
    public static void main(String[] args) {
         String str="abc"; 
         Subsequences(str, 0, "");
    }
}
