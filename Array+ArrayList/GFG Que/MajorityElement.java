// https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions
import java.util.*;
public class MajorityElement {
         
    public static void main(String[] args) {
       int  A[] = {1 ,13};
       System.out.println(majorityElement(A));

    } 
    static int majorityElement(int a[])
    {    int element=a[0];
          int b=a[0]; 
        int ans=0;                 //{1,2,3,3,3}
        int count=1;
         Arrays.sort(a);  
         if(a.length==1)
         {
            return a[0];
         }
         for (int i = 0; i < a.length; i++) {
             
            if(i!=0)
            
            {
              if(b==a[i])
              {
                count++; 
                if(ans<count)
                {
                    ans=count;
                    element=b;
                } 
              } 
              else 
              {  
                if(ans<count)
                {
                    ans=count;
                    element=b;
                } 
                b=a[i];  
               

                count=1;
              }
            } 
        
         }   
        //  System.out.println(count); 
        //  System.out.println(ans); 
        if(ans==1)
        {
            return -1;
        }
         if(ans-1>=a.length/2)
         {
            return element;
         }  
         else 
         {
            return -1;
         }
        
        
    }
}
wrong ans 