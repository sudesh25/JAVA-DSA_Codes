//https://leetcode.com/problems/build-array-from-permutation/
public class Permutation {
    static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) 
        {
            ans[i]=nums[nums[i]];
        } 
        return ans;
 } 
 public static void main(String[] args) {
    int arr[]={0,3,2,1,4,5};
    int an[]=buildArray(arr); 
    for(int i=0;i<an.length;i++) 
    {
        System.out.print(an[i]+" ");
    }

 }
}
