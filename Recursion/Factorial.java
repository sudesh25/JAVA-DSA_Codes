public class Factorial {
    public static void main(String[] args) {
        Factorial(5, 1, 1);
    } 
    public static void Factorial(int n,int i,int sum)
    {
       if(i==n+1)
       {
        System.out.println(sum);
        return ;
       } 
       sum=sum*i;
       Factorial(n,i+1,sum); 

//        if (n == 0)    
//     return 1;    
//   else    
//     return(n * Factorial(n-1)); 
    }
}
  