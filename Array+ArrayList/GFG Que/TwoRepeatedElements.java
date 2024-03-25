// https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions
import java .util.*;
public class TwoRepeatedElements {
     public static void main(String[] args) {
       int  arr[] = {9 ,1, 5, 6, 4, 3, 10, 8, 4, 2, 2, 7};  
       System.out.println(Arrays.toString(twoRepeated(arr)));

     }     
     static int[] twoRepeated(int arr[])
        {    int count=0;
            int ans[] =new int[2];  
            int a=0,b=0; 
            int c=0,d=0; 

                
            for (int i = 0; i < arr.length-1; i++) {
                
                for (int j = i+1; j < arr.length; j++) {
                        
                    if(arr[i]==arr[j])
                    {
                        if(count==0)
                        {
                            a=i;
                            b=j; 
                            count++;                        
                        } 
                        else 
                        {
                            c=i;
                            d=j; 
                            count++;
                        } 
                        if(count==3)
                        {
                            break;
                        }
                    }
                }
            } 
           
            if(b<c)
            {
                ans[0]=arr[b];
                ans[1]=arr[c];
            } 
            else if(b<d)
            {
                ans[0]=arr[b];
                ans[1]=arr[c];
            } 
            else 
            {
                ans[0]=arr[c];
                ans[1]=arr[b];
            }
            return ans;
     }
}
