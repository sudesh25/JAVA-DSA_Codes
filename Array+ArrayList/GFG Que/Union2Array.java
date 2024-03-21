// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/0

public class Union2Array {
      public static void main(String[] args) {
             int a[]={1,2,3,4,5,6,7,8,9}; 
             int b[]={7,8,9,10,11,12,13}; 
             int n=a.length; 
             int m=b.length; 
             System.out.println("Similar No is "+doUnion(a,n,b,m));
      }    
      static int doUnion(int a[], int n, int b[], int m) 
      {     int count=0;
             for (int i = 0; i < a.length; i++) {
                 
                for (int j = 0; j < b.length; j++) {
                     
                     if(a[i]==b[j])
                     {
                        count++;
                     }
                }
             } 
             return count;
      }
}
