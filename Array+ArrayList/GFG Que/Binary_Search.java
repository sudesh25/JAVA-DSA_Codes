public class Binary_Search {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int  target = 9; 
        System.out.println(search(nums,target));
    } 
    static  int search(int[] nums, int target) {
          
        int st=0;
        int ed=nums.length-1;
        while (st<=ed)
        {
            int mid =st+(ed-st)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(target>nums[mid])
            {
               st=mid+1;
            } 
            else if(target <nums[mid])
            {
                ed=mid-1;
            } 
            
        }
        return -1;
    }
}
