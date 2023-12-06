//https://leetcode.com/problems/running-sum-of-1d-array/
public class Sum_of_1D {  
    static int[] runningsum(int nums[]){
        int n=nums.length;
        int arr[]=new int[n]; 
        int j;
        arr[0]=nums[0];
        for(int i=1;i<n;i++)
        {   j=i;
            while(j>=0) 
            {   
                arr[i] = arr[i]+nums[j];
                j--;
            }
        } 
        return arr;
    }
   public static void main(String args[])
   {
    int nums[]={1,2,3,4,5};
    int sol[]=runningsum(nums); 
    for(int i=0;i<sol.length;i++)
    {
        System.out.print(sol[i]+" ");
    }
   }
}
