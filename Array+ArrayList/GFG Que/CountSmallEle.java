

public class CountSmallEle {
    public static void main(String[] args) {
        long small[]={1,2,4,5,8,10}; 
        long n=6;
        long x=9;
        long ans=countOfElements(small,n,x); 
        System.out.println(ans);
    } 
    static long countOfElements(long arr[], long n, long x)
    {
        long count=0;
        for (int i = 0; i < n; i++) 
        {
            if(arr[i]<=x) 
            {
                count++;
            }
        } 
        return count;
        
    }
}
