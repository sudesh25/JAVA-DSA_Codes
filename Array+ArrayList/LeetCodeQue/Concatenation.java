
//https://leetcode.com/problems/concatenation-of-array/

public class Concatenation {
    static int[] getConcatenation(int[] nums) { 
        int n=nums.length;
        int ans[]=new int[2*n]; 
        for(int i=0;i<n;i++) 
        {
            ans[i]=nums[i];
        }  
        int j=0;
        for(int i=n;i<(2*n);i++) 
        {
            ans[i]=nums[j];
            j++;
        } 
        return ans;
    } 

public static void main(String []args)
{ 
    int nums[]={1,2,3,2,1};
    int ans[]=getConcatenation(nums); 
    for(int i=0;i<ans.length;i++)
    {
        System.out.print(ans[i]+" ");
    }
} 
}
