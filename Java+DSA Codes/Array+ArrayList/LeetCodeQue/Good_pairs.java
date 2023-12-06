//https://leetcode.com/problems/number-of-good-pairs/


public class Good_pairs{ 
    static int goodpair(int nums[])
    {   int count=0;
        int i;
        int j;
        for( i=0;i<nums.length;i++)
        {
            for(j=1;j<nums.length;j++) 
            {
                if(nums[i]==nums[j] && i<j)
                {
                    count++;
                }
            }
        } 
        return count;
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,1,1,3};
         int n=goodpair(arr);
         System.out.println(n);
    }
}