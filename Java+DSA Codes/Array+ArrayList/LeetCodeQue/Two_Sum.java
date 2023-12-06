//https://leetcode.com/problems/two-sum/
public class Two_Sum {
    static int[] twoSum(int[] nums, int target) {
        
                
            int error[]={-1,-1};
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                   if(target==nums[i]+nums[j])
                   {    
                          int ans[]={i,j};
                          return ans;
                         
                   }
                    
                }
            }  
            return error;
            
             
         
    }  
    public static void main(String args[])
    {
         int nums[]={3,3};
        int target= 6;
        int index[]=twoSum(nums,target); 
        for(int i=0;i<index.length;i++)
        {
            System.out.print(index[i]+" ");
        }
    }
    }


