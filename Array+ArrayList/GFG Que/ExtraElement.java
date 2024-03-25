// https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions

public class ExtraElement {
    public static void main(String[] args) {
        
       int  N = 7;
        int A[] = {2,4,6,8,9,10,12};
        int B[] = {2,4,6,8,10,12}; 
        System.out.println(findExtra(A,B,N));
    } 
    static int findExtra(int a[], int b[], int n) {
         int ans=-1;   
        for (int i = 0; i < n-1; i++) {
             
            if(a[i]!=b[i])
            {
              return i;
            } 
            
        } 

        if(a.length>b.length)
            {
                return a.length-1;
            } 
            else 
            {
                return b.length-1;
            }
       
    }
}
