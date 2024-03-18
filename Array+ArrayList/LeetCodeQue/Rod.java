public class Rod {
    public static void main(String[] args) {
        int arr[]={2,7,9,3,1};
        System.out.println(rob(arr));
    } 
    static int rob(int[] nums) { 
        
        if(nums.length==1) 
        {
            return nums[0];
        }  
        else 
        {
        
          int rs=0;  
          for (int i = 1; i < nums.length; i=i+2) {
            rs=rs+nums[i];
          }

          for (int i = 0; i < nums.length-1; i++) {
                int ans=0; 
             for (int j = 0; j < nums.length;j=j+i+2 ) {
            
                 ans=ans+nums[j]; 

        }     if(ans>rs)    
        {
            rs=ans;
        }

          }
       
        
        return rs;
        }
}}
gfdg