public class CallGuest { 

    public static int call(int n)
    {
        if(n<=1)
        {
            return 1;
        } 
        int ways1=call(n-1);
        
        int ways2=(n-1) * call(n-2);

        return ways1+ways2;
    }
    public static void main(String[] args) {
        System.out.println(call(4));
    }
}
