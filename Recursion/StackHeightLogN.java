public class StackHeightLogN {
    public static void main(String[] args) {
        int x=2;
        int n=5; 
        System.out.println(calpow(x,n));

    } 
    public static int calpow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        } 
        if(x==0)
    {
        return  0;
    }  
       if(n % 2==0)
    {
      return calpow(x,n/2) * calpow(x,n/2);
    } 
   else 
   {
    return calpow(x,n/2)*calpow(x,n/2)*x;
   }
    }
}
