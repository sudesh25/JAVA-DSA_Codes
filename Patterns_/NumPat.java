//https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1?page=1&category=pattern-printing&sortBy=submissions

public class NumPat {
    public static void main(String[] args) {
        int n=3; 
        printPat(n);
    } 
   static void printPat(int n)
    {
        for(int i=n;i>0;i--) 
        {     
             int x=n; 
             int count=0;
              for (int j = 1; j <= i*n; j++)
              {     
                count++;
                    if(count>i) 
                    {
                        x--;        
                        count=1;
                    } 
                    System.out.print(x+" ");
              }
              System.out.print("$");
        }
    }
}
