public class LinearSearch {
     public static void main(String[] args) {
                 
         int arr[]={12,13,14,15,160};
         int target=15 ; 
         System.out.println(Linearsearch(arr,target));
         
     }  
     static int Linearsearch(int arr[], int target) 
     { 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
               return i; 
              
            }  
           
          
        } 
        return -1;
     }
}
