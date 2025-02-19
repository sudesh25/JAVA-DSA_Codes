// TC = O(n * n! )

public class Backtracking 
{     
    public static void printper(String str,String per,int idx)
    {   
        if(str.length()==0)
        {  
            System.out.println(per);
            return ;
        }
         for (int i = 0; i < str.length(); i++) {
             char cuchar=str.charAt(i);
             String  newstring=str.substring(0, i)+str.substring(i+1); 
             printper(newstring,per+cuchar,idx+1);
         }
    }
      public static void main(String[] args) {
             
        String str="abc"; 
        printper(str, "", 0);
      }
}