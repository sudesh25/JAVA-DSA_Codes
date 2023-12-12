//https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=1&category=Arrays&difficulty=School&sortBy=submissions

public class LeasTwoEle {
    public static void main(String[] args) {
        long arr[]={2, 8, 7, 1, 5}; 
        long n=5;  
        long ans[]=new long[3];
       ans = (findElements(arr,n)); 
       for (int i = 0; i < ans.length; i++) {
          System.out.print(ans[i]);
       }
    } 
    static long[] findElements( long a[], long n)
    {  int s=(int)n-2;
       long ans[]=new long[s]; 
       
       for (int i = 0; i < n-2; i++) 
       {
            long min=a[i];
            for (int j = i; j < n; j++) 
            {
                if(a[i]>a[j])
                {  
                    min=a[j];
                    a[j]=a[i];
                    a[i]=min;
                }
            } 
            ans[i]=min;
       }
       return ans;
    }
}
