public class PerfectArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2, 1}; 
        int n=5; 
        System.out.println(IsPerfect(arr,n));
    } 
    static boolean IsPerfect(int a[], int n)
    {
       boolean ans=true;  
       for (int i = 0; i < n; i++) 
       {
            if(a[i]!=a[n-1-i])
            {
                ans=false;
                break;
            }
       }
       return ans;
    }
}   
