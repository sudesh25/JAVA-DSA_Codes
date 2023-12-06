//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.*; 
public class Greatest_Candies { 
    static List<Boolean> kids(int candies[],int extracandies)
    {
        int max=candies[0]; 
        ArrayList<Boolean> list= new ArrayList<>();
        for(int i=0;i<candies.length;i++) 
        {
          if(candies[i]>max) 
          {
              max=candies[i];
          }
        } 
        for(int i=0;i<candies.length;i++) 
        {
           if(candies[i]+extracandies>=max) 
           {
               list.add(true);
           } 
           else 
           {
               list.add(false);
           }
        } 
        return list;
    }
      public static void main(String[] args) {
        int candies[]={5,4,3,1,1,7,6};
        int n=3;   
      
        System.out.println(kids(candies,n));
      }
}
