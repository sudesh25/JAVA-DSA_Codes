//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNo {  
       static int[] smallerNo(int arr[])
       {  
        int n=arr.length;
        int ans[]=new int[n]; 

        for(int i=0;i<n;i++)
        { 
              int count=0;
            for(int j=0;j<n;j++) 
            {
                if(arr[i]>arr[j] && j!=i) 
                {
                    count++;
                }
            } 
            ans[i]=count;
        } 
        return ans;
       }
    public static void main(String[] args) {
        int arr[]={8,1,2,2,3};
        int ans[]=smallerNo(arr); 
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
