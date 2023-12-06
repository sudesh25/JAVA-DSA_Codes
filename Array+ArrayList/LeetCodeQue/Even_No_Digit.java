//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Even_No_Digit {
    static int findNumbers(int[] nums) 
    {    int count=0;
        for (int i = 0; i < nums.length; i++) 
        {   
            int n=0;
            while(nums[i]!=0) 
            {
                n++;
                nums[i]=nums[i]/10;
            } 
            if(n%2==0) 
            {
                count++;
            }
        } 
        return count;
    }
    public static void main(String[] args)
     {
        int nums[]={12,345,2,6,7896};
       System.out.println(findNumbers(nums));
    }
}
