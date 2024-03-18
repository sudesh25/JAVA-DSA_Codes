import java.io.*; 
import java.util.*; 

//https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int  k=3; 
        rotate(arr,k);
        System.out.print(Arrays.toString(arr));
    }
    
        static void rotate(int[] nums, int k) {
            int F=nums[nums.length-1];
            int S;
           while(k!=0){
                 
                for (int j = 0; j < nums.length; j++) { 
                    
                    if(j<nums.length-1)
                    {  
                        if(j==0) 
                        {
                            F=nums[j]; 
                        }  
                   
                   S=nums[j+1];         
                   nums[j+1]=F; 
                   F=S;
                }
                else{
                    nums[0]=F;
                }
                }  
                k--;
            }
            


            
        }
        
    }
Time Complexity
