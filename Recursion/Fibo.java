public class Fibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        Fibo(a,b,n-2);
    } 
    public static void Fibo(int a,int b,int n)
    {     
        if(n==0)
        {
            return ;
        }
          int c=a+b;
          System.out.println(c);
          Fibo(b, c, n-1);
          
    }
}
