//  https://www.geeksforgeeks.org/problems/pangram-checking-1587115620/1?page=1&category=Strings&difficulty=Easy,Medium&sortBy=submissions
public class PanagramChecking {
     public static void main(String[] args) { 
        String s = "Bawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(s));
     } 
      static boolean checkPangram  (String s) 
      {
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
                    return false;
                }
         } 
           return true;
      }
}
