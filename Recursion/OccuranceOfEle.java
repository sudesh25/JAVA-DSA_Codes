// 

public class OccuranceOfEle {
   public static void main(String[] args) {
       String ans ="abaafdfrgfdvxdgdaafdfdaaddfdgacf"; 
       Occurance(ans, 'a',0, -1, -1); 
      // System.out.println(ans.length());
   }  
   public static void Occurance(String a,char target,int index,int fst, int lst )  
   {
           if(index==a.length()) 
           { 
            System.out.println("The First Occurance is "+fst+" And Last Occurance is "+lst);
            return ;
           }  
           if(a.charAt(index)==target)
           {
            if(fst==-1)
            {
               fst=index; 
            } 
            else 
            {
                lst=index;
            }
           } 
           Occurance(a, target, index+1, fst, lst);

   } 
}
