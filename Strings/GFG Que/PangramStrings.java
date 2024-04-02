// https://www.geeksforgeeks.org/problems/pangram-strings3155/1?page=1&category=Strings&difficulty=Easy,Medium&sortBy=submissions
public class PangramStrings {
    public static void main(String[] args) {
           String  S = "Pack mY box witH fIve dozen liquor jugs";
           System.out.println(isPanagram(S));
    } 
  static   int isPanagram(String s) {
         s=s.toLowerCase();
         s=s.replace(" ",""); 
         char Sen[]=s.toCharArray(); 
         for (char i='a'; i <='z'; i++) {
              int flag=0;  
             for (int j = 0; j < Sen.length; j++) {
                if(i==Sen[j])
                {
                    flag=1;
                    break;
                } 
                
             } 
             if(flag==0)
                {
                    return 0;
                }
         } 
           return 1;
    }
}
