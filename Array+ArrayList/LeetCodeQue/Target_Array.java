//https://leetcode.com/problems/create-target-array-in-the-given-order/
import java.util.*; 
public class Target_Array { 
    static int[] targetArray(int nums[],int index[])
    {     ArrayList<Integer> list=new ArrayList<>();
           int i=0;
           while(i!=nums.length) 
           {  
            list.add(index[i],nums[i]);
            i++;
           } 
           int size=list.size();
        int arr[]=new int[size]; 
        for (int j = 0; j < arr.length; j++) 
        {
            arr[j]=list.get(j);
        } 
        return arr;
           
    }
    public static void main(String[] args) {
          int nums[]={0,1,2,3,4};
          int index[]={0,1,2,2,1};
          int ans[]=targetArray(nums,index);
          for(int i=0;i<ans.length;i++) 
    {
        System.out.print(ans[i]+" ");
    }
    }
}
