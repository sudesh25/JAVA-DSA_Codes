// https://www.geeksforgeeks.org/problems/element-appearing-once2552/1

public class AppearOnce {
    public static void main(String[] args) {
           int arr[]={1, 1, 2,2, 5};
            System.out.println(search(arr));
    } 
    static int search(int A[])
    {    
         int count=0; 
         for (int i = 0; i < A.length; i++) { 
            
            if(i==A.length-1)
            {
                if(A[i]==count)
                {
                    return -1;
                } 
                return A[i];
            }
             if(i%2==0)
             {
                count=A[i];
                
             } 
             else if(count==A[i])
             {
               
             } 
             else 
             {
                return  count;
             }
         } 
         return -1;
    }
}
