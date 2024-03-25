// https://www.geeksforgeeks.org/problems/peak-element/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions

public class PeakElement {
     public static void main(String[] args) {
         int arr[] = {1, 2, 3}; 
         System.out.println(peakElement(arr));
         
     } 
      static int peakElement(int[] arr)
    {   
         int index=-1;  
         if(arr.length==1)
         {
            return arr[0];
         }
        if(arr.length>1) 
        {
            if(arr[0]>=arr[1])
            {
                return 0;
            }    
            if(arr[arr.length-1]>=arr[arr.length-2]) 
            {
               return arr.length-1;
            }
        }
          
        
         for (int i = 1; i < arr.length-1; i++) {
             
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                index=i;
            }
         } 
         return index;
        
    }
}
