  // https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions

import java.util.ArrayList;

public class LeaderInArr {
    public static void main(String[] args) {
       int  A[] = {16,17,4,3,5,2};  
       System.out.println(leaders(A) );
    } 

     static ArrayList<Integer> leaders(int arr[]){
            
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        
         int flag=0;
                 for (int i = 0; i < arr.length-1; i++) {
                     
                    for (int j = i; j < arr.length; j++) {
                         
                     if(arr[i]>=arr[j])
                     {
                        flag=0;
                     } 
                     else 
                     {  
                        flag=1;
                        break;
                     }
                    }  
                    if(flag!=1)
                    {
                        al.add(arr[i]);
                    }
                    
                 }  
                  
                 al.add(arr[arr.length-1]);  
                 return (al);  
    }
}
