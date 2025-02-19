public class Fibonacci {
    public static void main(String[] args) {
         int n=5; 
         System.out.println(recursive(n));
    } 
      static int series(int n)
    {
      if(n<=1)
      {
          return n;
      } 
      int a=0; 
      int b=1; 
      int c=0;
      for (int i = 1; i < n; i++) {
          c= a+b ; 
          a=b;
          b=c;
      } 
      return c;
    } 
      static int recursive(int n)
      {
        if(n<=1){
            return n;
        } 
        return recursive(n-1)+recursive(n-2);
        
      }
}
 