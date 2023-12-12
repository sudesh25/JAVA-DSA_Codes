//

public class palindromic {
    public static void main(String[] args) {
        int a[]={121,131,111};
        int n=3;  
        System.out.println(palinArray(a,n));
    } 
     static int palinArray(int[] a, int n)
    {   
        int flag=1;
         for (int i = 0; i < n; i++)
         {  
            String s=a[i]+""; 
            char[]ans=s.toCharArray(); 
            int k=0;
            int j=ans.length-1;
            while(k<=j)
            {
             if(ans[k]!=ans[j])
             {
                flag=0; 
                break;
             } 
             k++;
             j--;
            }
         } 
         return flag;
    }
}
