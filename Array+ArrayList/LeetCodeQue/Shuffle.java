//https://leetcode.com/problems/shuffle-the-array/
public class Shuffle { 
    static int[] shuffle(int arr[],int n) 
    {   int ans[]=new int[2*n]; 
        int m=0;
        int l=4;
        for(int i=0;i<2*n;i++) 
        {
          if(i%2==0) 
          {
            ans[i]=arr[m];
            m++;
          } 
          else {
             ans[i]=arr[l];
             l++;
          }
        } 
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,2,1};
        int n=4; 
        int ans[]=shuffle(arr,n);
        for(int i=0;i<ans.length;i++) 
        {
            System.out.print(ans[i]+" ");
        }
    }
}
